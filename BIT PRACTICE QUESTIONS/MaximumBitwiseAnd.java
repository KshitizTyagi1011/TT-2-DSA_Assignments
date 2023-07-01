public class MaximumBitwiseAnd {
    public static int findMaxBitwiseAnd(int[] nums) {
        int maxBitwiseAnd = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int bitwiseAnd = nums[i] & nums[j];
                if (bitwiseAnd > maxBitwiseAnd) {
                    maxBitwiseAnd = bitwiseAnd;
                }
            }
        }

        return maxBitwiseAnd;
    }

    public static void main(String[] args) {
        int[] nums = {3, 5, 8, 10, 12};
        int result = findMaxBitwiseAnd(nums);
        System.out.println(result);  // Output: 8
    }
}
