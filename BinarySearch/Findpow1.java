package BinarySearch;

public class Findpow1 {
    public static void main(String[] args){
        int num=4;
        int p=3;
        finp(num, p);
    }
    public static void finp(int num,int p){
        int val=1;
        for(int i=0;i<=p;i++){
            val=(int)Math.pow(num, p);
     
        }
        System.out.println(val);
    }
}
