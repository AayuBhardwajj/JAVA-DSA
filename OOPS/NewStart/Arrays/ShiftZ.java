package Arrays;

public class ShiftZ {
    public static void main(String[] args) {
        int arr[]={12,0,3,4,5,0,2,1,0,0,45,0,6};
        shiftZeroesToEnd(arr);
        printAr(arr);
    }
    public static void shiftZeroesToEnd(int arr[]){
        int first=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                first=i;
                break;
            }
        }
        for(int i=first+1;i<arr.length;i++){
            if(arr[i]!=0){
                swap(arr,i,first);
                first++;
            }
        }
    }
        public static void swap(int arr[],int start, int end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
        }

        public static void printAr(int arr[]){
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+"  ");
            }
        }
    
}
