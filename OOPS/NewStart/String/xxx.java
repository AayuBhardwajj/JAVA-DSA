import java.util.*;

public class xxx {
   /*  public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter an input: ");
        int a = s.nextInt();
        findSum(a);
    }

    public static void findSum(int a) {
        int sum = 0;
        while (a > 0) {
            int rem = a % 10;
            if (rem % 2 != 0) { 
                sum += rem;
                a = a / 10;
            } else {
                return; 
            }
        }
        System.out.println("Sum of odd digits: " + sum);
    }*/
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size=s.nextInt();
        int arr[]= new int[size];
        System.out.println("Start entering the "+size+" elements: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
        System.out.println("Enter the element you wanna find out: ");
        int x=s.nextInt();

        binS(arr, x);
    }
    public static void binS(int arr[], int x){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
        if(arr[mid]==x){
            System.out.println(x+" has been found at index "+mid);
            return;
        }else if(arr[mid]>x){
            end=mid-1;
        }else{
            start=mid+1;
        }
    }
    System.out.println(x+" wasnt't found");
} 
}