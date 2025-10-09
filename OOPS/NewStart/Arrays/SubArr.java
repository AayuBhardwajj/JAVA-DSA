package Arrays;

public class SubArr {
    public static void main(String[] args){
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        printArray(arr);
        findSub(arr);
        printArray(arr);
    }
    public static void findSub(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+ " ");
                }
                System.out.println();
            }
        }
    }
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
}
