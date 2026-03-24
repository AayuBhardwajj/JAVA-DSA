package Recursion;

public class PrintNames {
    public static void main(String[] agrs){
        printName(1);
    }
    public static void printName(int i){
        if(i>5){
            return;
        }
        System.out.println("Aayush");
        printName(i+1);
    }
}
