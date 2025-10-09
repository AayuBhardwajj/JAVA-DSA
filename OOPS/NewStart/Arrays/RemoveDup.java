package Arrays;

public class RemoveDup {
    public static void main(String[] args){
        int arr[]={1,1,2,2,2,3};
        System.out.println(removeTheDUplicates(arr));

    }
    public static int removeTheDUplicates(int arr[]){
        int i=0;
        for(int j=1;j<arr.length;j++){
            if(arr[j]!=arr[i]){
                arr[i+1]=arr[j];
                i++;
            }
        }
        return i+1;
    }

   

}
