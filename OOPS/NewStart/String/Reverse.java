package String;
import java.util.*;
public class Reverse {
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the string input: ");
        String input=s.nextLine();
        System.out.println("The string input you entered is: "+input);
        System.out.println("The reversed form of your input is: "+revIt(input));
    }
    public static String revIt(String input){
    StringBuilder str=new StringBuilder(" ");
        int end=input.length()-1;
        while(end>=0){
            str.append(input.charAt(end));
            end--;
        }
        return str.toString();
    }
}
