package Placement;
import java.util.ArrayList;
public class RangeSubQuery {
    public static void main(String[] args){
        int arr[]={10,20,30,40,50,60};
        rangeSum(arr, 2, 3);
    }
    public static void rangeSum(int arr[],int L, int R){
        ArrayList<Integer>al = new ArrayList<>();
        al.add(arr[0]);
        for(int i=1;i<arr.length;i++){
            al.add(al.get(i-1)+arr[i]);
        }
        int finalS=0;
        if(L==0){
           finalS= al.get(R);
        }
        finalS= al.get(R)- al.get(L-1);
        System.out.println(finalS);
    }
}
