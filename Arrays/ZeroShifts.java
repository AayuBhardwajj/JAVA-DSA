public class ZeroShifts {
    public static void main(String[] args){
        int arr[]={0,0,1,2,3,0,0};
        //shiftZero(arr);
        swap(arr);
    }
    public static void shiftZero(int arr[]){
        int i=0;
        for(int j=0;j<arr.length;j++){
            if(arr[j]!=0){
                arr[i++]=arr[j];
            }
        }
            while(i<arr.length){
                arr[i++]=0;
            }
        
        for(int x=0;x<arr.length;x++){
            System.out.print(arr[x]+" ");
        }
    }

    public static void swap(int arr[]){
        int i=0;
        for(int j=0;j<arr.length;j++){
            if(arr[j]!=0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
            }
        }
        for(int x=0;x<arr.length;x++){
            System.out.print(arr[x]+" ");
        }
    }

}