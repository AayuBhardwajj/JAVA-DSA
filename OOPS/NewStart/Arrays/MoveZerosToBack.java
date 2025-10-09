zpackage Arrays;

public class MoveZerosToBack {
    public static void main(String[] args){
        int arr[]={1,0,3,0,0,5,6,0,0,9};
        moveZeros(arr);
        printArr(arr);
    }
    public static void moveZeros(int arr[]){
        int size=arr.length;
        int temp[]=new int[size];
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                temp[j++]=arr[i];
            }
        }
        while(j<size){
            temp[j++]=0;
        }
        for(int i=0;i<size;i++){
            arr[i]=temp[i];
        }
    }
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

}
