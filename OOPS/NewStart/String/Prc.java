package String;
import java.util.*;
public class Prc {
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the string input: ");
        String sr=s.nextLine();
        System.out.println(toUp(sr));
    }
    public static String toUp(String sr){
        StringBuilder sre= new StringBuilder(" ");
        char ch=Character.toUpperCase(sr.charAt(0));
        sre.append(ch);
        for(int i=1;i<sr.length();i++){
            if(sr.charAt(i)==' ' && i<sr.length()-1){
                sre.append(' ');
                i++;
                sre.append(Character.toUpperCase(sr.charAt(i)));
            }
            else{
                sre.append(sr.charAt(i));
            }
        }
        
        return sre.toString();
    }
}
