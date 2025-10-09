import java.util.*;
public class Compression {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the String input for compression: ");
        String input= s.next();
        System.out.println("STring input you entered is: "+input);
        System.out.println("Compressed form is: "+yy(input));
    }
    public static String compressInput(String input){
        String xyz="";
        Integer count=1;
        for(int i=0;i<input.length();i++){
            while(i<input.length()-1 && input.charAt(i)== input.charAt(i+1)){
                count++;
                i++;
            }
            xyz+=input.charAt(i);
            if(count>=1){
                xyz+=count.toString();
            }
            count=1;
        }
        return xyz;
    }
    public static String yy(String input){
        StringBuilder sr= new StringBuilder(" ");
        Integer count=1;
        for(int i=0;i<input.length();i++){
            while(i<input.length()-1 && input.charAt(i)==input.charAt(i+1)){
                i++;
                count++;
            }
            sr.append(input.charAt(i));
            if(count>=1){
                sr.append(count.toString());
            }
            count=1;
        }
        return sr.toString();
    }
    
}
