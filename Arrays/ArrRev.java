public class ArrRev {
    public static void main(String[] args){
        int arr[]={1,2,3,4,5,6};
        reverseTheArray(arr);
        printTheArray(arr);
    }
    public static void reverseTheArray(int arr[]){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;

            start++;
            end--;
        }

    }
    public static void printTheArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
