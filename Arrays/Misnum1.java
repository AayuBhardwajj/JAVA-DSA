public class Misnum1 {
    public static void main(String[] args) {
        int arr[]={1,2,3,5};
        int N=5;
        findMisN(arr, N);
    }
  
        
    public static void findMisN(int arr[], int N){
        int Sum=0;
        int firstNSum=(N*(N+1))/2;
        for(int i=0;i<arr.length;i++){
            Sum+=arr[i];
        }
        System.out.println("The number that is missing is: "+(firstNSum-Sum));
    }
}
