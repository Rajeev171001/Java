public class SpiralPrint{
    public static void main(String[] args) {
        int arr[][]={{5,1,9,11},
                    {2,4,8,10},
                    {13,3,6,7},
                    {15,14,12,16}};

        int cmin=0;
        int rmin=0;
        int cmax=arr[0].length-1;
        int rmax=arr.length-1;

        while(cmin<cmax&&rmin<rmax){

        for(int i=cmin;i<=cmax;i++){
            System.out.print(arr[rmin][i]+" ");
        }
        rmin++;

        for(int i=rmin;i<=rmax;i++){
            System.out.print(arr[i][cmax]+" ");
        }
        cmax--;

        for(int i=cmax;i>=cmin;i--){
            System.out.print(arr[rmax][i]+" ");
        }
        rmax--;

        for(int i=rmax;i>=rmin;i--){
            System.out.print(arr[i][cmin]+" ");
        }
        cmin++;
    }
}
}
