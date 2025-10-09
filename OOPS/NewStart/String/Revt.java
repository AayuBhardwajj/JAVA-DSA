package String;
import java.util.*;
public class Revt {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter your string input: ");
        String srt=s.next();
        System.out.println("The string input you entered is: "+srt);
        System.out.println("The reverse form of your input is: "+reverseTheString(srt));
    }
    public static String reverseTheString(String srt){
       char yu[] = srt.toCharArray();
        int start=0;
        int end=yu.length-1;
        while(start<end){
            char temp=yu[start];
            yu[start]=yu[end];
            yu[end]=temp;
            start++;
            end--;
        }
        return new String(yu);
    }
}
