import java.util.*;
public class xyz {
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size= s.nextInt();
        int arr[]= new int[size];
        if(size>0){
        System.out.println("Enter the "+size+" elements for array: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
        kadan(arr);
}
else{
    System.out.println("Invalid size");
}
    }

    public static void kadan(int arr[]){
        int curS=0;
        int maxS=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            curS+=arr[i];
            if(curS<0){
                curS=0;
            }
            maxS=Math.max(curS, maxS);
        }
        System.out.println(maxS);
    } 
}
