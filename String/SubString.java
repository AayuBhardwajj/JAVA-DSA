import java.util.*;
public class SubString {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the string input: ");
        String input= s.next();
        findSub(input);
    }
    public static void findSub(String input){
        for(int i=0;i<input.length();i++){
            for(int j=i+1;j<=input.length();j++){
                String substri= input.substring(i,j);
                System.out.print(substri+" ");
            }
        }
    }
}
