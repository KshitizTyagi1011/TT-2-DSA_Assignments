import java.util.HashSet;
import java.util.Scanner;

public class subarray_zero_sum {
    public static boolean subarrayExists(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int prefixSum = 0;

        for (int num : nums) {
            prefixSum += num;

            if (prefixSum == 0 || set.contains(prefixSum))
                return true;
            set.add(prefixSum);
        }

        // No subarray with sum 0 found
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the array size
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        // Input the array elements
        System.out.print("Enter the array elements: ");
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        // Check if a subarray with sum 0 exists
        boolean exists = subarrayExists(nums);

        // Print the result
        if (exists)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
