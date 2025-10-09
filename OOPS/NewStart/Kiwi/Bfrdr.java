import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Bfrdr {
    public static void main(String[] args) {
        InputStreamReader in= new InputStreamReader(System.in);
        BufferedReader bf= new BufferedReader(in);
        try{
        System.out.println("Enter your name");
        String str= bf.readLine();

        System.out.println("Enter your age: ");
        int n=Integer.parseInt(bf.readLine());
        System.out.println("Your name is: "+str);

        System.out.println("The input you entered is: "+n);

        bf.close();
        }catch(IOException e){
       System.out.println("There was an error, maybe you entered an invalid input, most prolly you entered an integer input in your name");
    }
        catch(NumberFormatException x){
            System.out.println("There was an error, maybe you entered an invalid input, most prolly you entered an invalid input ");
        }   
}
}