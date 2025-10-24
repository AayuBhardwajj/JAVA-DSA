public class Misnum {
    public static void main(String[] args) {
        int arr[]={1,2,3,5};
        int N=5;
        findmisNum(arr, N); 
    }
    public static void findmisNum(int arr[],int N){
        for(int i=1;i<=N;i++){
            int count=0;
            for(int j=0;j<arr.length;j++){
                if(i==arr[j]){
                    count++;
                }
            }
            if(count==0){
                System.out.println("The missing element is: "+i);
            }
        }
    }
}
