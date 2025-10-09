package NewStart.Prac;
import java.util.*;
public class BinS {
    public static void main(String[] args){
        int arr[]={2,3,4,5,6,7,71,90};
        int key=6; 
        System.out.println(searchIt(arr, key));
    }
    public static int searchIt(int arr[], int key){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
                if(arr[mid]==key){
                    return mid;
                }
                else if(arr[mid]>key){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
            return -1;
        }
    }

