package ArrayList;

public class St {
    public static void main(String[] args){
        int arr[]={73,74,75,71,69,72,76,73};
        findSol(arr);
    }
    public static void findSol(int arr[]){
        int temp[]= new int[arr.length];
        for(int i=0;i<arr.length;i++){
            int start=i;
            int end=i+1;
            
            while(end<arr.length && arr[end]<=arr[start]){
                end++;
            }
                if(end<arr.length && arr[end]>arr[start]){
                    temp[i]=end-start;
                }else{
                    temp[i]=0;
                }
            }

            for(int i:temp){
                System.out.print(i+" ");
            }


        }
    }
    


