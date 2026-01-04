package BinarySearch;

public class RotatedSorted {
    public static void main(String[] args){
    int arr[]={7,8,9,1,2,3,4};
    int target=1;
    findTarget(arr, target);
    }
    public static void findTarget(int arr[],int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                System.out.println(i);
                return;
            }
            }
            System.out.println("Element not found");
        }
    }   

