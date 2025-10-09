package String;
import java.util.*;
public class Anagram {
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the string input1: ");
        String input1=s.next();
        System.out.println("Enter the string input2: ");
        String input2=s.next();
        checkForAnagram(input1, input2);
    }
    public static void checkForAnagram(String input1, String input2){
        if(input1.length()==input2.length()){
            input1=input1.toLowerCase();
            input2=input2.toLowerCase();

            char rt[]=input1.toCharArray();
            char rt1[]=input2.toCharArray();
            Arrays.sort(rt);
            Arrays.sort(rt1);

            boolean result=Arrays.equals(rt, rt1);
            if(result==true){
                System.out.println("Both strings are anagram");
            }
            
            else{
                System.out.println("They arent anagrams");
            }
        }
    }
}
