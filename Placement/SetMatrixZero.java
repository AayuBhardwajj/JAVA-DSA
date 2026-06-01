package Placement;

public class SetMatrixZero {
    public static void main(String[] args) {
        int arr[][]={{1,1,1},
                    {1,0,1},
                    {1,1,1}};
                    
        int rows= arr.length; // initialie rows
        int cols= arr[0].length; // initialise cols

        makeMatrixZero(arr, rows, cols);
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
}
