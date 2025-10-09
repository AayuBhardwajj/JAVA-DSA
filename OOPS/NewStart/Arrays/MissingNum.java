package Arrays;

public class MissingNum {
    public static void main(String[] args){
        int arr[]={1,2,3,5};
        int x=5;
        //System.out.println(findmis(arr, x));
        //System.out.println(findMiss(arr, x));
        System.out.println(findTheMissingNum(arr, x));

    }   
    public static int findmis(int arr[], int x){
        for(int i=1;i<=x;i++){
            int flag=0;
            for(int j=0;j<arr.length;j++){
                if(arr[j]==i){
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                return i;
            }
        }
        return -1;
    }

    public static int findMiss(int arr[], int x){
        int sum=(x*(x+1))/2;
        int storedS=0;
        for(int i=0;i<arr.length;i++){
            storedS+=arr[i];
        }
        return (sum-storedS);
    }

    public static int findTheMissingNum(int arr[], int x){
        int XOR1=0;
        int XOR2=0;
        for(int i=0;i<x-1;i++){
            XOR2= XOR2 ^ arr[i];
            XOR1= XOR1 ^ (i+1);
        }
        XOR1= XOR1^x;
        return (XOR1 ^ XOR2);
    }
}
