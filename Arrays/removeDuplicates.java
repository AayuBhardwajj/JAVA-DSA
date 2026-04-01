import java.util.*;
public class removeDuplicates{
    public static void main(String[] args){
        int arr[]={1,1,1,1,2,2,2,3};
        //removeDuplicates(arr);
        //usingArrayList(arr);
        usingTwoPointers(arr);
    }
    public static void removeDuplicates(int arr[]){
        int k=0;
        for(int i=0;i<arr.length;i++){
            boolean isDuplicate=false;
            for(int j=0;j<i;j++){
                if(arr[i]==arr[j]){
                    isDuplicate=true;
                    break;
                }
            }
            if(!isDuplicate){
                arr[k]=arr[i];
                k++;
            }
        }
        System.out.println(k);
    }
    public static void usingArrayList(int arr[]){
        ArrayList<Integer>al= new ArrayList<>();
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=arr[i-1]){
                al.add(arr[i]);
            }
        }
        System.out.println(al.size()+1);
    }
    public static void usingTwoPointers(int arr[]){
        int i=0;
        for(int j=1;j<arr.length;j++){
            if(arr[i]!=arr[j]){
                arr[i+1]=arr[j];
                i++;
            }
        }
        System.out.println(i+1);
    }
}