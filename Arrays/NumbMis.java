public class NumbMis {
    public static void main(String[] args){
        int arr[]={1,2,3,5};
        findMissingNum(arr);
    }
    public static void findMissingNum(int arr[]){
        int x=arr.length;
        int xor0=0;
        int xor1=0;
        for(int i=1;i<=x+1;i++){
            xor0^=i;
        }
        for(int i=0;i<x;i++){
            xor1^=arr[i];
        }
        System.out.println(xor0 ^ xor1);
    }
}
