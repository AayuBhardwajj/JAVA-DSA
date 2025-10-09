//package JAVA-DSA.Two Pointers;

public class RemoveDuplicates {
    public static void main(String[] args){
        int arr[]={1,1,2};
       // noDup(arr);
        noDup(arr);
    }
    public static void noDup(int arr[]){
        int j=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]!=arr[i+1]){
                arr[j++]=arr[i];
            }
        }
            arr[j++]=arr[arr.length-1];
            for(int i=0;i<j;i++){
                System.err.print(arr[i]+" ");
            }
        }

        

        
    }


