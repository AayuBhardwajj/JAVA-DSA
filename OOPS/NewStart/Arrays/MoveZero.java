//package NewStart.Arrays;

public class MoveZero {
    public static void main(String args[]){
        int arr[]={1,0,23,4,0,98,0,100,0,7};
    takeZ(arr);
    
    

    }
    public static void takeZ(int arr[]){
        int temp[]=new int[arr.length];
        int tempin=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                temp[tempin++]=arr[i];
            }
        }
        for(int i=0;i<tempin;i++){
            System.out.print(temp[i]+" ");
        }
        for(int i=tempin;i<arr.length;i++){
        
            arr[i]=0;
        }
    
    }
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
