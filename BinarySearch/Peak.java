package BinarySearch;

public class Peak {
    public static void main(String[] args){
        int arr[]={1,2,3,4,5,6,7,8,5,1};
        System.out.println(findFindPeak(arr));
    }
    public static int findFindPeak(int arr[]){
        for(int i=0;i<arr.length;i++){
            boolean left= (i==0) || (arr[i]>=arr[i-1]) ;

            boolean right= (i==arr.length-1) || (arr[i+1]<=arr[i]);
            if(left && right){
                return arr[i];
            }
        }
        return -1;
    }
}
