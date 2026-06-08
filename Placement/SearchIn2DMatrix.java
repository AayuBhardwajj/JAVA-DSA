public class SearchIn2DMatrix {
    public static void main(String[] args){
        int arr[][]={{1,3,5,7},
                    {10,11,16,20},
                    {23,30,34,60},
                };
                int target=11;
                int rows=arr.length;
                int cols=arr[0].length;
                System.out.println(searchInMatrix(arr, target,rows,cols));
    }

    public static boolean searchInMatrix(int arr[][], int target, int rows, int cols){
        int n=rows*cols;
        int start=0;
        int end=n-1;
        while(start<=end){
            int mid=(start+end)/2;
            int r=mid/cols;
            int c=mid%cols;
            if(arr[r][c]==target){
                return true;
            }else if(arr[r][c]>target){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return false;
    }
}