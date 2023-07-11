public class LastIndex {
    public static void main(String[] args) {
        int key=0;
        int [] arr={1,2,3,-10,-11,2,7,9,2,11};
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==2){
                key=i;
            }
        }
        System.out.println(key);
    }
}
