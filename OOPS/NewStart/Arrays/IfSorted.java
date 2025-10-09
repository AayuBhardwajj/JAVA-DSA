public class IfSorted{
    public static void main(String[] args){
        int arr[]={17,3,21,12,7,5,91,69};
        System.out.println(isSorted(arr, 0));
    }
    public static boolean isSorted(int arr[], int i){
        int x=arr.length;
        if(i==x-1||x==0 || x==1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return isSorted(arr, i+1);
    }
}