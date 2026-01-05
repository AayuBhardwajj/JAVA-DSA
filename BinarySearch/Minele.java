package BinarySearch;

public class Minele {
    public static void main(String[] args){
        int arr[]={4,5,6,7,0,1,2};
            findMin(arr);
    }
    public static void findMin(int arr[]){
        int min=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Minimum elemnt is: "+min);
    }
}
