package Arrays;

public class ZeroShift {
    public static void main(String[] args) {
        int arr[]={1,0,2,3,2,0,0,4,5,1};
        pushZeros(arr);
        //pushZeros(arr);
        //thirdApproach(arr);
        printArr(arr);
    }
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void pushZeros(int arr[]){
        int j=0;
        int temp[]= new int[arr.length];
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                temp[j++]=arr[i];
            }
        }
        int xs=temp.length;
        for(int i=0;i<temp.length;i++){
            arr[i]=temp[i];
        }
    }

    public static void swap(int arr[],int start, int end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
    }

    public static void swapZeroes(int arr[]){
        int j=-1;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                j=i;
                break;
            }
        }

          if(j==arr.length){
            System.out.println("There is no 0 element in this array");
        }


        for(int i=j+1;i<arr.length;i++){
            if(arr[i]!=0){
                swap(arr, j, i);
                j++;
            }
        }
    }

    public static void thirdApproach(int arr[]){
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[j++]=arr[i];
            }
        }
        while(j<arr.length){
            arr[j++]=0;
        }
    }

}

