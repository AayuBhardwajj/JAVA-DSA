package Prac;

public class Nqueens {
    public static void main(String[] args){
        int n=4;
        char chess[][]= new char[n][n];
        for(int i=0;i<chess.length;i++){
            for(int j=0;j<chess.length;j++){
                chess[i][j]='*';
            }
        }
        if(sitQueen(chess, 0)){
            System.out.println("Yes the solution exists");
        }else{
            System.out.println("No, Solution doesn't exists");
        }
        System.out.println("No. of total possible ways: "+count);
}
    

    static int count=0;
    public static boolean sitQueen(char chess[][], int row){
        if(row==chess.length){
            printBoard(chess);
            count++;
            return true;
        }
        for(int j=0;j<chess.length;j++){
            if(isSafe(chess, row, j)){
            chess[row][j]='Q';
            if(sitQueen(chess, row+1)){
                return true;
            }
            chess[row][j]='*';
        }
    }
    return false;
}

    public static void printBoard(char chess[][]){
        for(int i=0;i<chess.length;i++){
            for(int j=0;j<chess.length;j++){
                System.out.print(chess[i][j]+" ");
            }
            System.out.println();
        }
           System.out.println("------------");
    }

    public static boolean isSafe(char chess[][], int row, int col){
        for(int i=row-1;i>=0;i--){
            if(chess[i][col]=='Q'){
                return false;
            }
        }

        for(int i=row-1,j=col-1;i>=0 && j>=0;i--, j--){
            if(chess[i][j]=='Q'){
                return false;
            }
        }

        for(int i=row-1, j=col+1; i>=0 && j<chess.length;i--, j++){
            if(chess[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }
}
