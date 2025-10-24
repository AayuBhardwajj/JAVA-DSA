public class Misnum2 {
    public static void main(String[] args) {
        int arr[]={1,2,3,5};
        int N=5;
        findMis(arr, N);
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
