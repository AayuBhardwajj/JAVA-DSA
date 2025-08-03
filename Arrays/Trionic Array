class Solution {
    public boolean isTrionic(int[] nums) {
        for(int p=1;p<nums.length-2;p++){
            for(int q=p+1;q<nums.length-1;q++){
                if(checkIncrease(nums,0,p) &&
                   checkDecrease(nums,p,q) &&
                   checkIncrease(nums,q,nums.length-1)){
                    return true;
                   }
            }
        }
        return false;
    }
    private boolean checkIncrease(int nums[], int start, int end){
        for(int i=start;i<end;i++){
            if(nums[i]>=nums[i+1]){
                return false;
            }
        }
        return true;
    }
     private boolean checkDecrease(int nums[], int start, int end){
        for(int i=start;i<end;i++){
            if(nums[i]<=nums[i+1]){
                return false;
            }
        }
        return true;
    }
}
