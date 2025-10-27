import java.util.ArrayList;
public class MovZer {
    public static void main(String[] args) {
        int arr[]={1,0,2,0,3,0,4,0,5,0,6,0};
        //moveZeroesToEnd(arr);
        pushZeroesToBack(arr);
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

    public static void swap(int i, int j, int arr[]){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public static void pushZeroesToBack(int arr[]){
        int x=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                x=i;
                break;
            }
        }
            for(int i=x+1;i<arr.length;i++){
                if(arr[i]!=0){
                    swap(x, i, arr);
                    x++;
                }
            }
        }
    }

