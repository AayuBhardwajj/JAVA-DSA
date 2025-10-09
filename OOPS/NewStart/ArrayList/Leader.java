package ArrayList;
import java.util.ArrayList;
public class Leader {
    public static void main(String[] args) {
        // ArrayList <Integer> al= new ArrayList<>();
        // al.add(1);
        // al.add(2);
        // al.add(5);
        // al.add(3);
        // al.add(1);
        // al.add(2);
        int arr[]={1,2,5,3,1,2};
        //findLeader(arr);
        better(arr);

    }
    public static void findLeader(int arr[]){
        int ref[]= new int[arr.length];
        int k=0;
        for(int i=0;i<arr.length;i++){
            boolean isLeader=true;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    isLeader=false;
                    break;
                }
            }
            if(isLeader){
                System.out.print(arr[i]+" ");
            }
        }
    }

    public static void better(int arr[]){
        int max=arr[arr.length-1];
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]>max){
                max=arr[i];
            }
            System.out.print(max+" ");
        }
    }
}
