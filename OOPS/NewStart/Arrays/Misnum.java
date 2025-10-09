package Arrays;

public class Misnum {
    public static void main(String[] args) {
        int arr[]={1,2,3,5};
        int N=5;
        //findmisNum(arr, N);
        //findMisN(arr, N);
        findMis(arr, N);
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
    public static void findMisN(int arr[], int N){
        int Sum=0;
        int firstNSum=(N*(N+1))/2;
        for(int i=0;i<arr.length;i++){
            Sum+=arr[i];
        }
        System.out.println("The number that is missing is: "+(firstNSum-Sum));
    }

    public static void findMis(int arr[], int N){
        int Xor1=0;
        int Xor2=0;
        for(int i=0;i<arr.length;i++){
            Xor1^=arr[i];
            Xor2^=(i+1);
        }
        Xor2^=N;
        System.out.println(Xor1-Xor2);
    }
}
