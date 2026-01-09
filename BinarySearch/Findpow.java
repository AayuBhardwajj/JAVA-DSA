package BinarySearch;
public class Findpow {
    public static void main(String[] args){
        int num=4;
        int i=2;
        findp(num, i);
    }
    public static void findp(int num, int i){
        int val=1;
        for(int k=0;k<=i;k++){
            val=val*num;
        }
        System.out.println(val);
    }
}
