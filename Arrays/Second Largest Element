import java.util.*;
public class SeconL {
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size=s.nextInt();
        int arr[]= new int[size];
        System.out.println("Enter the "+size+" elements: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
        findL(arr);
    }
    public static void findL(int arr[]){
        int lar=arr[0];
        int secL=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>lar){
               secL=lar;
               lar=arr[i]; 
            }
            else if(arr[i]<lar && arr[i]>secL){
                secL=arr[i];
            }
        }
        System.out.println("The largest element is: "+lar);
        System.out.println("The second largest element is: "+secL);

    }
}
