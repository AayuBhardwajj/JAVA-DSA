package HashMap;
import java.util.*;
public class MyMap {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size=s.nextInt();

        int arr[]=new int[size];

        for(int i=0;i<arr.length;i++){
            System.out.println("Enter the element at index [ "+i+" ]: ");
            arr[i]=s.nextInt();
        }

        HashMap <Integer, Integer> hm= new HashMap<>();
        for(int i=0;i<arr.length;i++){
            hm.put(arr[i], hm.getOrDefault(arr[i], 0)+1);
        }

        for(Map.Entry<Integer, Integer> entry : hm.entrySet()){
            System.out.println(entry.getKey()+"  "+entry.getValue());
        }
    } 
}
