public class Palindrome{
    public static void main(String[] args){
        String a="Naman";
        System.out.println(isPalindrome(a, 0, a.length()-1));
    }
    public static boolean isPalindrome(String a, int start, int end){
        a=a.toLowerCase();
        if(start>=end){
            return true;
        }
        if(a.charAt(start)!=a.charAt(end)){
            return false;
        }
        return isPalindrome(a, start+1, end-1);
    }
}