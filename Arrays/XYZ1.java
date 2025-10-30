import java.util.*;
public class XYZ1 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows= s.nextInt();

        System.out.println("Enter the number of columns: ");
        int cols= s.nextInt();

        int[][] arr= new int[rows][cols];

        System.out.println("Start entering the "+(rows*cols)+" elements for your "+rows+" * "+cols+" matrix: ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                arr[i][j]=s.nextInt();
            }
        }
        printMatrix(arr, rows, cols);

        int n=rows*cols;
       theBruteForce(arr, rows, cols, n);

    }
    public static void printMatrix(int arr[][], int rows, int cols){
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }

  
    public static void theBruteForce(int arr[][], int rows, int cols,int n){
        int temparr[][]=new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                temparr[j][rows-1-i]=arr[i][j];
            }
        }
        printMatrix(temparr, rows, cols);
    }
  }
