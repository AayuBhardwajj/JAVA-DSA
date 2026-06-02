package Placement;
public class PascalsTri{
    public static void main(String[] args){
        findEle(4, 2);
    }

    public static void findEle(int row, int col){
        int r=row-1;
        int c=col-1;
        int num=1;
        for(int i=0;i<c;i++){
            num=num*(r-i);
            num=num/(i+1);
        }
        System.out.println("ELement present at row: "+row +" and col: "+col+": "+num);
    }
}