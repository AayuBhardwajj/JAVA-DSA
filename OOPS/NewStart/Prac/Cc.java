package Prac;

public class Cc {
    public static void main(String[] args){
        //int a=10;
        //printRev(a);
       // int b=1;
       // printInc(b);
        // int x=9;
        // System.out.println("Factorial of "+x+" is: "+findFact(x));
        // int x=5;
        // System.out.println("Sum of first "+x+" natural numbers is: "+findSumOfNaturalNumbers(x));
        //int f=24;
        //System.out.println(findFibonacci(f));
        int arr[]={12,3,4,56,12};
        // System.err.println(ifSorted(arr));
        //System.out.println(firstOccurence(arr, 56, 0));
        System.out.println(lastOccurance(arr, 12, 0));


    }
    public static void printRev(int a){
        if(a<=0){
            return;
        }
        System.out.println(a);
        printRev(a-1);
    }
    public static void printInc(int b){
        if(b>=11){
            return;
        }
        System.out.println(b);
        printInc(b+1);
    }

    public static int findFact(int x){
        if(x==0 || x==1){
            return 1;
        }
        // int fn=findFact(x-1);
        // int y=x*fn;
        // return y;
        return x*findFact(x-1);
    }

    public static int findSumOfNaturalNumbers(int x){
        if(x==0){
            return 0;
        }
        return x+findSumOfNaturalNumbers(x-1);
    }

    public static int findFibonacci(int f){
        if(f==1){
            return 1;
        }
        if(f==0){
            return 0;
        }
        return findFibonacci(f-1)+ findFibonacci(f-2);
    }

    public static boolean ifSorted(int arr[]){
        boolean check=false;
        if(arr.length<=1){
            return true;
        }
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return check;
    }

    public static int firstOccurence(int arr[], int key, int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return firstOccurence(arr, key, i+1);
    }

    public static int lastOccurance(int arr[], int key, int i){
        if(i==arr.length){
            return -1;
        }
        int isFound=lastOccurance(arr, key, i+1);

        if(isFound== -1 && arr[i]==key){
            return i;
        }
        return isFound;
    }
}
