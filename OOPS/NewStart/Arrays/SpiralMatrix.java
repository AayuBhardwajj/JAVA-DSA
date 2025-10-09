package Arrays;
public class SpiralMatrix {
    public static void main(String args[]){
        int matr[][]={{1,2,3,4},
    {5,6,7,8},
    {9,10,11,12},
    {13,14,15,16}};
    sP(matr); }
    public static void sP(int matr[][]){
    int startR=0;
     int startC=0;
    int endR=matr.length-1;
    int endC=matr[0].length-1;
    
    while(startR<=endR && startC<=endC){
 for(int j=startC;j<=endC;j++){
System.out.print(matr[startR][j]+" ");
 }
for(int i=startR+1;i<=endR;i++){
System.err.print(matr[i][endC]+" ");

}
for(int j=endC-1;j>=startC;j--){
System.err.print(matr[endR][j]+" ");

}
for(int i=endR-1;i>=startR+1;i--){
System.out.print(matr[i][endC]+" ");

}
startC++;
startR++;
endC--;
endR--;
}
}
    }

