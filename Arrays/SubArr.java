public class SubArr {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8};
        printTheSubArrays(arr);
        System.out.println("--------------");
        printTheSubArrays1(arr);
    }
    public static void printTheSubArrays(int arr[]){
        for(int i=0;i<arr.length;i++){
            int x=i;
        for(int j=i;j<arr.length;j++){
            int y=j;
        for(int k=x;k<=y;k++){
            System.out.print(arr[k]+" ");
        }
        System.out.println();
        }
        System.out.println();
    }
}
    public static void printTheSubArrays1(int arr[]){
        for(int i=0;i<arr.length;i++){
        for(int j=i;j<arr.length;j++){
            System.out.print("( "+arr[i]+","+" "+arr[j]+")");
    
        }
        System.out.println();
    }
}
}
