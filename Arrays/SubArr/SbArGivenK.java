package SubArr;

public class SbArGivenK {
    public static void main(String[] args){
        int arr[]={10,5,2,7,1,9};
        int k=15;
        //findSum(arr, k);
        optimizedpp(arr, k);
    }
    public static void findSum(int arr[], int k){
        int maxS=0;
        for(int i=0;i<arr.length;i++){
             int sum=0;
            for(int j=i;j<arr.length;j++){
                sum+=arr[j];
                if(sum==k){
                maxS=Math.max(maxS, j-i+1);
            }
            }
        }
        System.out.println(maxS);
    }

    public static void optimizedpp(int arr[],int k){
        int i=0;
        int max=0;
        int sum=0;
        for(int j=0;j<arr.length;j++){
            sum+=arr[j];

          while(sum>k){
                sum-=arr[i];
                i++;
            }
            
            if (sum==k) {
                max=Math.max(max, j-i+1);
            }
          
        }
        System.out.println(max);
        }
    }

