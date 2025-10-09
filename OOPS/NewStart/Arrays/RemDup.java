package Arrays;

public class RemDup {
    public static void main(String[] args){
        int arr[]={1,2,2,3,4,5,5,5,6,6,7,8,9,10,11,11};
        //removeDuplicate(arr);
        int size=remDupl(arr);
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void removeDuplicate(int arr[]){
        int x=arr.length;
        if(x==0 || x==1){
            System.out.println(arr[0]);
        }
        int temp[]=new int[arr.length];
        int t=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]!=arr[i+1]){
                temp[t++]=arr[i];
            }
        }
            temp[t++]=arr[arr.length-1];
            for(int i=0;i<t;i++){
                System.out.print(temp[i]+" ");
            }
        }
    public static int remDupl(int arr[]){
        int y=arr.length;
        if(y==0 || y==1){
            return y;
        }
        int k=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]!=arr[i+1]){
                arr[k++]=arr[i];
            }
        }
        arr[k++]=arr[arr.length-1];
        return k;
    }
    }

