/*package NewStart.Arrays;

public class Duplicate {
    public static void main(String args[]){
        int arr[]={12,34,12,5,34,7,5};
        printOriginal(arr);
    }
    public static void printOriginal(int arr[]){
        int helperAr[]=new int[arr.length];
        helperAr[0]=arr[0];
        for(int i=0;i<helperAr.length;i++){
            if(arr[i]==arr[i+1]){
                helperAr[i]=arr[i];
            }
        }
        System.out.println(helperAr[i]);
    }
}
*/ 
package NewStart.Arrays;

import java.util.Arrays;

public class Duplicate {
    public static void main(String args[]) {
        int arr[] = {12, 34, 12, 5, 34, 7, 5};
        printOriginal(arr);
    }

    public static void printOriginal(int arr[]) {
        int[] helperAr = new int[arr.length];
        int helperIndex = 0;
        
        
        for (int i = 0; i < arr.length; i++) {
            boolean isDuplicate = false;
            
            for (int j = 0; j < helperIndex; j++) {
                if (arr[i] == helperAr[j]) {
                    isDuplicate = true;
                    break;
                }
            }
         
            if (!isDuplicate) {
                helperAr[helperIndex] = arr[i];
                helperIndex++;
            }
        }
        
        System.out.println("Array without duplicates:");
        for (int i = 0; i < helperIndex; i++) {
            System.out.print(helperAr[i] + " ");
        }
    }
}