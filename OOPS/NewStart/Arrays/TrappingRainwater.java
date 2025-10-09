import java.util.*;
public class TrappingRainwater {
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the number of the bars to store rainwater: ");
        int num=s.nextInt();
        int barHeights[]=new int[num];
        System.out.println("Enter the heights of "+num+" bars: ");
        for(int i=0;i<barHeights.length;i++){
            barHeights[i]=s.nextInt();
        }
        printArray(barHeights);
        System.out.println();
        //rainwtr(barHeights);
        System.out.println(findTrWater(barHeights));
        
    }
    public static void rainwtr(int barHeights[]){
        int leftMax[]=new int[barHeights.length];
        leftMax[0]=barHeights[0];
        for(int i=1;i<barHeights.length;i++){
            leftMax[i]=Math.max(barHeights[i], leftMax[i-1]);
        }
        int rightMax[]= new int[barHeights.length];
        rightMax[barHeights.length-1]=barHeights[barHeights.length-1];
        for(int i=barHeights.length-2;i>=0;i--){
            rightMax[i]=Math.max(barHeights[i], rightMax[i+1]);
        }
        int trapW=0;
        for(int i=0;i<barHeights.length;i++){
            int waterLevel=Math.min(leftMax[i], rightMax[i]);
            trapW+=(waterLevel-barHeights[i]);
        }
        System.out.println("The max volume of rainwater that can be stored is: "+trapW);

    }
    public static void printArray(int barHeights[]){
        for(int i=0;i<barHeights.length;i++){
            System.out.println("Height of bar entered at position [ "+i+" ] is: "+barHeights[i]);
        }
    }
    public static int findTrWater(int barHeights[]){
        int left=0;
        int right=barHeights.length-1;
        int trapWw=0;
        int leftMaxx=0;
        int rightMaxx=0;
        while(left<right){
            if(barHeights[left]<barHeights[right]){
                if(barHeights[left]>leftMaxx){
                    leftMaxx=barHeights[left];
                }
                else{
                    trapWw+=leftMaxx-barHeights[left];
                }
                left++;
            }
            else{
                if(barHeights[right]>rightMaxx){
                    rightMaxx=barHeights[right];
                }
                else{
                    trapWw+=rightMaxx-barHeights[right];
                }
                right--;
            }
        }
        return trapWw;
    }
}
