import java.util.*;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();   // size of array
        int k = sc.nextInt();   // window size

        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        double result = maxSubArray(nums, k);
        System.out.println(result);
    }

    public static double maxSubArray(int[] nums, int k) {
        int n = nums.length;

        // Step 1: sum of first window
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        int maxSum = sum;

        // Step 2: slide window
        for (int i = k; i < n; i++) {
            sum += nums[i];        // add next element
            sum -= nums[i - k];    // remove previous window element
            maxSum = Math.max(maxSum, sum);
        }

        // Step 3: return average
        return (double) maxSum / k;
    }
}