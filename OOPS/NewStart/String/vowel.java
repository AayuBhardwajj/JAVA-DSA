package String;
import java.util.*;
public class vowel {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter a String input: ");
        String str=s.nextLine();
        findVow(str);
    }
    public static void findVow(String str){
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='a'||ch=='e'){
                System.out.println("It is a vowel");
            }
            else{
                System.out.println("This doesn't contains a vowel");
            }
        }
    }
}
