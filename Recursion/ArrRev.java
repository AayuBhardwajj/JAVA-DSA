public class ArrRev {
    public static void main(String[] args){
        int arr[]={1,2,3,4,5};
        recurRev(arr, 0, arr.length-1);
        prAr(arr);
        
    }
    public static void recurRev(int arr[], int start, int end){
      
        if(start>=end){
            return;
        }
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;

            recurRev(arr, start+1, end-1);
        }
        public static void prAr(int arr[]){
            for(int i: arr){
                System.out.print(i+" ");
            }
        }
    }

