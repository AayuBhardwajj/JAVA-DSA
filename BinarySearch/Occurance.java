package BinarySearch;

public class Occurance {
    public static void main(String[] args){
        int arr[]={1,2,2,2,2,3,4,5};
        int x=2;
        findTheOccurance(arr, x);
    }
    public static void findTheOccurance(int arr[],int x){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                count++;
            }
        }
        System.out.println(count);
    }
}
