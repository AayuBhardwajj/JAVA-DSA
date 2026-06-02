package Placement;

public class SetMatrixZero {
    public static void main(String[] args) {
        int arr[][]={{1,1,1},
                    {0,1,1},
                    {1,1,1}};
                    
        int rows= arr.length; // initialie rows
        int cols= arr[0].length; // initialise cols

        // makeMatrixZero(arr, rows, cols);
        // printMatrix(arr, rows, cols);

        optimizedSetMatrix(arr, rows, cols);
        printMatrix(arr, rows, cols);
    }
    public static void makeMatrixZero(int arr[][], int rows, int cols){
        
        
        boolean[] row= new boolean[rows];  // make a separate array that would store the 0 values
        boolean[] col= new boolean[cols];  // make a separate array that would store the 0 values
        for(int i=0;i<rows;i++){
            for(int j=0; j<cols;j++){
                if(arr[i][j]==0){           // if any element is zero.. use the pointer and mark the specific row and cols
                  row[i]=true;    
                  col[j]=true;
                }
            }
        }
        for(int i=0;i<rows;i++){ 
            for(int j=0;j<cols;j++){
                if(row[i] || col[j]){           // if any marked row appears, make that row, column = 0
                    arr[i][j]=0; 
                }
            }
        }

    }

    public static void printMatrix(int arr[][], int rows, int cols){
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){                                                // print matrix
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    
    public static void optimizedSetMatrix(int arr[][], int rows, int cols){
       

        int col0 = 1; // Tracks whether first column should be zeroed

        // Step 1: Mark rows and columns
        for (int i = 0; i < rows; i++) {

            if (arr[i][0] == 0) {
                col0 = 0;
            }

            for (int j = 1; j < cols; j++) {

                if (arr[i][j] == 0) {
                    arr[i][0] = 0; // Mark row
                    arr[0][j] = 0; // Mark column
                }
            }
        }

        // Step 2: Fill matrix using markers (bottom-up)
        for (int i = rows - 1; i >= 0; i--) {

            for (int j = cols - 1; j >= 1; j--) {

                if (arr[i][0] == 0 || arr[0][j] == 0) {
                    arr[i][j] = 0;
                }
            }

            // Handle first column separately
            if (col0 == 0) {
                arr[i][0] = 0;
            }
        }
    }

    public static void printMatrix(int[][] arr) {

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }

            System.out.println();
        }
    }
}
    

