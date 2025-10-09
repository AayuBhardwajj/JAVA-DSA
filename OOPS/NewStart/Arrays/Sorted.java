package NewStart.Arrays;

public class Sorted {
    public static void main(String args[]){
        int arr[]={19,3,5,7,9,11};
        System.out.println(findSorted(arr));
    }
    public static boolean findSorted(int arr[]){
        for(int i=0;i<arr.length;i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
            else{
                return true;
            }
        }
        return true;
    }
}
