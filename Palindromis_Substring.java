public class PalindromicSubstring {
    public static void main(String[] args) {
        String s="Hello";
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                String str=s.substring(i,j);
                if(isPalindrome(str)==true){
                    System.out.println(str);
                }
            }
        }
    }
    public static boolean isPalindrome(String str){
        int i=0,j=str.length()-1;
        while(i<j)
        {
            if(str.charAt(i)!=str.charAt(j)){
                return false;
                
            }
            i++;
            j--;
        }
        return true;
    }
}
