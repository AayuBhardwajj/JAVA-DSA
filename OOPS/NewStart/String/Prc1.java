package String;

public class Prc1 {
    public static void main(String args[]){
        String str="Hello this is aayush";
        StringBuilder srt= new StringBuilder();
        for(int i=0;i<str.length();i++){
            if(i==0 || str.charAt(i-1)==' '){
                srt.append(Character.toUpperCase(str.charAt(i)));
            } else{
                srt.append(str.charAt(i));
            
            }
        }
        System.out.println(srt.toString());
    }
}

