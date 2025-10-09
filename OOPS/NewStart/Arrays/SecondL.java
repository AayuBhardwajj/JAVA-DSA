package NewStart.Arrays;

public class SecondL {
    public static void main(String args[]){
        int arr[]={2,13,9,45,7,89};
       findL(arr);
       findsL(arr);
    }
    public static void findL(int arr[]){
        int largest=arr[0];
        int secL=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                secL=largest;
                largest=arr[i];
            }
            else if(arr[i]<largest && arr[i]>secL){
                secL=arr[i];
            }
        }
        System.out.println("The largest element is: "+largest);
        System.out.println("The second largest element is: "+secL);
    }
    public static void findsL(int arr[]){
        int smallest=arr[0];
        int ssm=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
        if(arr[i]<smallest){
            ssm=smallest;
            smallest=arr[i];
        }
        else if(arr[i]!=smallest && arr[i]<ssm){
            ssm=arr[i];
        }
    }
    System.out.println("Smallest element is: "+smallest);
    System.out.println("Second smallest element is: "+ssm);
}

    
}
