package Placement;

public class Icecream {
    public static void main(String[] args) {
        int costs[]={10,6,8,7,7,8};
        int coins=5;
        findIceCream(costs, coins);
    }
    public static void findIceCream(int costs[],int coins){
        int count=0;
        int preCount=0;
        for(int i=0;i<costs.length;i++){
            if(coins<costs[i]){
                continue;
            }
            if(preCount+costs[i]<coins){
                preCount+=costs[i];
                count++;
            }
        }
        System.out.println(count);
    }
}
