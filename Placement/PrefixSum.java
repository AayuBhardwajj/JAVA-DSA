import java.util.ArrayList;

public class PrefixSum{
    public static void main(String[] args){
        int arr[]={10,20,10,5,15};
        System.out.println(printPrefix(arr));
    }
    public static ArrayList<Integer> printPrefix(int arr[]){
        ArrayList<Integer>al = new ArrayList<>();
        al.add(arr[0]);
        for(int i=1;i<arr.length;i++){
            al.add(al.get(i-1)+arr[i]);
        }
        return al;
    }
}