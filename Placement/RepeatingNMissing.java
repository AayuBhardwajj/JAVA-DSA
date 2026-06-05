package Placement;

public class RepeatingNMissing {
    public static void main(String[] args){
        int arr[][]={{1,3},{2,2}};
      findMissing(arr);
      
    }
    public static void findMissing(int arr[][]){
       int N=arr.length;
       int n=N*N;
        int miss=0;
        int repeat=0;

        for(int num=1;num<=n;num++){
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i][j]==num){
                    count++;
                }
            }
        }
        if(count==2){
            repeat=num;
        }else if(count==0){
            miss=num;
        }
    }
    System.out.println("Missing number is: "+miss);
    System.out.println("Repeating number is: "+repeat);
}
}
