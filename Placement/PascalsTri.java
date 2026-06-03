package Placement;
public class PascalsTri{
    public static void main(String[] args){
        findEle(5, 2);
        printNthrow(4);
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

    public static void printNthrow(int row){
        int r=row-1;
        int ans=1;
        System.out.println(1);
        for(int i=0;i<r;i++){
            ans=ans*(r-i);
            ans=ans/(i+1);
            System.out.println(ans);
        }
    }
}