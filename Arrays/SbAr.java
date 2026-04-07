public class SbAr {
    public static void main(String[] args){
        int arr[]={1,2,3};
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int pr=1;
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+" ");
                    pr*=arr[k];
                    System.out.println(" = "+pr);
            }
                }
                System.out.println();
                
        }
    }
}
