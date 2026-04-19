public class SingleNumber3 {
    public static int[] singleNumber(int[] nums) {
        int xorVal = 0;
        for (int x : nums) xorVal ^= x;

        int diffBit = xorVal & -xorVal;

        int a = 0, b = 0;
        for (int x : nums) {
            if ((x & diffBit) != 0) a ^= x;
            else b ^= x;
        }
        return new int[]{a, b};
    }
}

