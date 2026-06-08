package Placement;

public class RepeatingNMissing {
    public static void main(String[] args){
        int arr[][]={{1,3},{2,2}};
        //findMissing(arr);
        missingNumBetter(arr);
        optimizedMathApproach(arr);
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

    public static void missingNumBetter(int arr[][]){
        int N=arr.length;
        int n=N*N;

        int freq[]= new int[n+1];
        for(int rows[]:arr){
            for(int x: rows){
                freq[x]++;
            }
        }
        int missing=0;
        int repeating=0;
        for(int i=1;i<=n;i++){
            if(freq[i]==0){
                missing=i;
            }else if(freq[i]==2){
                repeating=i;
            }
        }
        System.out.println("Missing: "+missing);
        System.out.println("Repeating: "+repeating);
    }

    public static void optimizedMathApproach(int arr[][]){
        int N=arr.length;
        int n=N*N;
    
        int actualSum= (n*(n+1))/2;
        int actualSqSqum= ((n*(n+1))*(2*n+1))/6;
        int orgSum=0;
        int orgSqSum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
            orgSum+=arr[i][j];
            orgSqSum+=arr[i][j]*arr[i][j];
        }
    }

        int val1= actualSum-orgSum;   // x-y
        int val2=actualSqSqum-orgSqSum;  // x^2 - y^2
        val2=val2/val1; // Using the identity of a^2-b^2 , (x+y)= val2 / (x-y)

        int x= ( val1+val2)/2;
        int y= x-val1;

        System.out.println("Missing value: "+x);
        System.out.println("Repeating Value: "+y);
    }
    

}
