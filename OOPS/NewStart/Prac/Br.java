// package Prac;

// public class Br {
//     public static void main(String[] args) {
//         for(int i=1;i<=50;i++){
//             if(i<=10){
//                 continue;
//             }
//             System.err.println(i);
//             if(i>=30){
//                 break;
//             }
//         }
//     }
// }
public class Br{
    public static void main(String args[]){
        int a=5;
        findSquare(a);
        findCube(a);
    }
    public static void findSquare(int a){
        System.out.println("The sqaure of "+a+" is: "+a*a);
    }
    public static void findCube(int a){
        System.out.println("The cube of "+a+" is: "+a*a*a);
    }
}