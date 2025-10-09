package String;

public class Comparison {
    public static void main(String[] args) {
        String s1="Cars";
        String s2= new String("bikes");
        String s3="Cars";
        String s44= new String("Cars");
        if(s1.equals(s44)){
            System.out.println("Using the .equals function, Both strings are same");
        }
        else{
            System.out.println("Not same");
        }
    }
}
