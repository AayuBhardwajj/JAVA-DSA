import java.util.*;
public class SortedSearch {
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows=s.nextInt();
        System.out.println("Enter the number of columns: ");
        int cols=s.nextInt();
        int arr[][]=new int[rows][cols];
        System.out.println("Enter the elements: ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.println("Enter this element at position ( "+i+" , "+j+" ) : ");
                arr[i][j]=s.nextInt();
            }
        }
        System.out.println("Enter an element you wanna find: ");
        int key=s.nextInt();
        printTheArray(arr, rows, cols);
        System.out.println(findTheKey(arr, rows, cols, key));
        s.close();

    }
    public static void printTheArray(int arr[][], int rows, int cols){
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.println("Element at position ( "+i+" , "+j+" ) :"+arr[i][j]);
            }
        }
    }
    public static boolean findTheKey(int arr[][], int rows, int cols, int key){
        while(rows<rows && cols>=0){
            if(key==arr[rows][cols]){
                System.out.println("Key found at position: "+rows+" ,"+cols+" ");
                return true;
            }
            else if (key<arr[rows][cols]){
                cols--;
            }
            else{
                rows++;
            }
        }
        return false;
    }
}

