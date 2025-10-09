import java.util.*;
public class Transpose {
    public static void main(String args[]){
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the size of rows: ");
        int rows=s.nextInt();
        System.out.println("Enter the size of columns: ");
        int columns=s.nextInt();
        int arr[][]= new int[rows][columns];
        System.out.println("Enter the elements for 2d array: ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                arr[i][j]=s.nextInt();
            }
        }
        printArr(arr, rows, columns);
        printTranspose(arr, rows, columns);
    }
    public static void printArr(int arr[][], int rows, int columns){
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                System.out.println("Element entered at position [ "+i+" , "+j+" ]= "+arr[i][j]);
            }
        }
        System.err.println();
    }
    public static void printTranspose(int arr[][],int rows, int columns){
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                System.out.println("Element entered at position [ "+i+" , "+j+" ]= "+arr[j][i]);
            }
        }
        System.err.println();
    }
        
    }

