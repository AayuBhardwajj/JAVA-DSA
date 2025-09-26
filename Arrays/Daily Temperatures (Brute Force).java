class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int temp[]= new int[temperatures.length];
        for(int i=0;i<temperatures.length;i++){
            int start=i;
            int end=i+1;
            while(end<temperatures.length && temperatures[start]>=temperatures[end]){
                end++;
            }
            if(end<temperatures.length ){
                temp[i]=end-start;
            }else{
                temp[i]=0;
            }
        }
        return temp;
    }
}
