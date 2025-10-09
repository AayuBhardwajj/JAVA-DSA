package NewStart.Prac;

public class ArrayPayrs {
    public static void main(String[] args) {
        int arr[]={2,3,4,5,6,7,8};
        printPairs(arr); 
        System.out.println();
        printSubarray(arr);
       }
    public static void printPairs(int arr[]){
        for(int i=0;i<arr.length;i++){
            int start=arr[i];
            for(int j=i+1;j<arr.length;j++){
                System.out.print("( "+start+" ,"+arr[j]+")");
            }
            System.out.println();
        }
    }
    public static void printSubarray(int arr[]){
        for(int i=0;i<arr.length;i++){
        for(int j=i+1;j<arr.length;j++){
          
        for(int k=i;k<=j;k++){
            System.out.print("( "+arr[k]+" )");
            }
            System.out.println();
        }
        System.out.println();
    }
   
}
}

