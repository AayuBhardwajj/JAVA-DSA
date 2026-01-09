package BinarySearch;

public class fFindpowbs {
    public static void main(String[] args){
        int num=4;
        int p=3;
        int ans=64;
        findAns(num, p, ans);
    }
    public static int findpow(int num, int p, int ans){
        int val=1;
        for(int i=1;i<=p;i++){
            val*=num;
            if(val>ans) return val;
        }
        return val;
    }
    public static void findAns(int num, int p, int ans){
        int start=1;
        int end=31;
        while(start<=end){
            int mid=start+(end-start)/2;
            int an=findpow(num,mid,ans);
            if(an==ans){
                System.out.println("Yes");
                return;
            }
            if(an>ans){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        System.out.println("No");
    }
}
