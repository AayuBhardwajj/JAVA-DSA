import java.util.HashMap;

public class ContDup2 {

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                if (i - map.get(nums[i]) <= k) {
                    return true;
                }
            }
            map.put(nums[i], i);
        }
        return false;
    }

    public static void main(String[] args) {
        ContDup2 obj = new ContDup2();
        int[] nums1 = {1, 2, 3, 1};
        int k1 = 3;
        int[] nums2 = {1, 0, 1, 1};
        int k2 = 1;
        int[] nums3 = {1, 2, 3, 1, 2, 3};
        int k3 = 2;
        System.out.println(obj.containsNearbyDuplicate(nums1, k1)); 
        System.out.println(obj.containsNearbyDuplicate(nums2, k2)); 
        System.out.println(obj.containsNearbyDuplicate(nums3, k3)); 
    }
}