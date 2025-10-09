package Stack;
import java.util.*;
public class StringRev {
    
    public static void reverseString(String str){
        Stack<Character> s= new Stack();
        int ind=str.length();

        while(ind<str.length()){
            System.out.println(s.pop());
        }
    }
    public static void main(String[] args){
        reverseString("Aayush");
    }
}
