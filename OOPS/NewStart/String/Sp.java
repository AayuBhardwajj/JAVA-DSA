package String;
import java.util.*;
public class Sp {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the direction input: ");
        String dir=s.nextLine();
        findD(dir);
    }
    public static float findD(String dir){
        int x=0, y=0;
        float dis;
        for(int i=0;i<dir.length();i++){
            char o=dir.charAt(i);
            if(o=='N'){
                y++;
            }
            else if(o=='S'){
                y--;
            }
            else if(o=='E'){
                x++;
            }
            else{
                x--;
            }
        }
        int x2=x*x;
        int y2=y*y;
        return dis=(float)Math.sqrt(x2+y2);
        
    }
}
