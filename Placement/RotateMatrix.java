package Placement;

public class RotateMatrix {
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        int rows=arr.length;
        int cols=arr[0].length;
        makeTranspose(arr, rows, cols);
        reverse(arr);
        printMatrix(arr, rows, cols);
        
       
    }
    public static void makeTranspose(int arr[][],int rows, int cols){        // Make the transpose of original matrix
         for(int i=0;i<rows;i++){
            for(int j=i+1;j<cols;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
        }
    }
    }
    public static void reverse(int arr[][]){
        for(int i=0;i<arr.length;i++){                  // reverse each row
            int left=0;
            int right=arr.length-1;

            while(left<right){
                int temp=arr[i][left];
                arr[i][left]=arr[i][right];
                arr[i][right]=temp;

                left++;
                right--;
            }
        }
    } 
    public static void printMatrix(int arr[][],int rows, int cols){
        for(int i=0;i<rows;i++){                                        // print the updated ( matrix with reversed rows of transpose matrix)
            for(int j=0;j<cols;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
