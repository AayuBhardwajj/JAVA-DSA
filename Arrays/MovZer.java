import java.util.ArrayList;
public class MovZer {
    public static void main(String[] args) {
        int arr[]={1,0,2,0,3,0,4,0,5,0,6,0};
        moveZeroesToEnd(arr);
        printAr(arr);
    }

    public static void moveZeroesToEnd(int arr[]){
       ArrayList<Integer> al= new ArrayList<>();
       for(int i=0;i<arr.length;i++){
        if(arr[i]!=0){
            al.add(arr[i]);
        }
    }
        for(int i=0;i<al.size();i++){
            arr[i]=al.get(i);
        }
        for(int i=al.size();i<arr.length;i++){
            arr[i]=0;
        }
       }
        

    public static void printAr(int arr[]){
        for(int i: arr){
            System.out.print(i+" ");
        }

    }
}
