package String;
import java.util.*;
public class Vowelcount {
    public static void main(String args[]){
        Scanner s= new Scanner(System.in);
        System.out.println("Enter your String input: ");
        String strr=s.nextLine();
        findNoVowel(strr);
    }
    public static void findNoVowel(String strr){
        int count=0;
        for(int i=0;i<strr.length();i++){
            char x=strr.charAt(i);
            if(x=='a'|| x=='e'|| x=='i'|| x=='o'|| x=='u'|| x=='A'|| x=='E'|| x=='I'|| x=='O'|| x=='U'){
                count++;
            }
        }
        System.out.println("The number of vowels "+strr+ " had is: "+count);
    }
}
