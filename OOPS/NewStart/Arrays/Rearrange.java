package Arrays;
import java.util.*;
public class Rearrange{
    public static void main(String[] args){
        int arr[]={1,2,-4,-5};
        rear(arr);
        for(int i: arr){
            System.out.print(i+" ");
        }
    }
    public static void rear(int arr[]){
        int posTem[]=new int [arr.length/2];
         int negTem[]=new int [arr.length/2];
        int j=0;
        int k=0;
         for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                posTem[j++]=arr[i];
            }else{
                negTem[k++]=arr[i];
            }
         }
         int p=0;
         int n=0;
         int i=0;
         while(p<j && n<k){
            arr[i++]=posTem[p++];
            arr[i++]=negTem[n++];
         }

         while(p<j){
            arr[i++]=posTem[p++];
         }

         while(n<k){
            arr[i++]=negTem[n++];
         }

    }

    public static void tr(int arr[]){
        ArrayList a1= new ArrayList<>();
        ArrayList a2= new ArrayList<>();
        ArrayList a3= new ArrayList<>();

        for(int i=0;i<arr.length;i++){
            a1.add(arr[i]);
        }
    }
}