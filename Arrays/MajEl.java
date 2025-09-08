//package JAVA-DSA.Arrays;
import java.util.ArrayList;
public class MajEl {
    public static void main(String[] args){
        int arr[]={1,1,1,3,3,2,2,2};
        System.out.println(findTheMajorOccurance(arr));
    }
    public static ArrayList<Integer> findTheMajorOccurance(int arr[]){
        int x=arr.length/3;
        ArrayList <Integer> list= new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            int count=0;

            if(list.contains(arr[i])){
                continue;
            }
            for(int j=0;j<arr.length;j++){
                if(arr[j]==arr[i]){
                    count++;
                }
            }
            if(count>x){
                list.add(arr[i]);
            }
            if(list.size()>2){
                break;
            }
        }
        return list;
    }
}