import java.util.*;
public class Count {
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the string input: ");
        String input=s.nextLine();
        System.out.println(findLowerCase(input)+" times");
    }
    public static int findLowerCase(String input){
        int ct=0;
        for(int i=0;i<input.length();i++){
            if(input.charAt(i)>='a' && input.charAt(i)<='z'){
                ct++;
            }
        }
        return ct;
    }
}
