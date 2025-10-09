package Prac;

public class pp {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,7};
        evenSum(arr);
        oddSum(arr);

    }
    public static void evenSum(int arr[]){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                count+=arr[i];
            }
        }
        System.out.println("Sum of even elements are: "+count);
    }

     public static void oddSum(int arr[]){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                count+=arr[i];
            }
        }
        System.out.println("Sum of odd elements are: "+count);
    }

    
}
