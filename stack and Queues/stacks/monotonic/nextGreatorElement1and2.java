package monotonic;

import java.util.*;

public class nextGreatorElement1and2 {

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stack = new Stack<>(); // Stack to keep track of elements
        Map<Integer, Integer> map = new HashMap<>(); // Map to store the next greater elements

        // Iterate over nums2 from the end to the beginning
        for (int i = nums2.length - 1; i >= 0; i--) {
            // Pop elements from the stack that are less than or equal to nums2[i]
            while (!stack.isEmpty() && nums2[i] >= stack.peek()) {
                stack.pop();
            }

            // If the stack is empty, no greater element exists
            if (stack.isEmpty()) {
                map.put(nums2[i], -1);
            } else {
                // The top element of the stack is the next greater element
                map.put(nums2[i], stack.peek());
            }

            // Push the current element onto the stack
            stack.push(nums2[i]);
        }

        // Prepare the result array for nums1
        int[] result = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            // Get the next greater element for each element in nums1 from the map
            result[i] = map.get(nums1[i]);
        }

        return result;
    }

    // Example usage
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums1 = {4, 1, 2};
        int[] nums2 = {1, 3, 4, 2};
        int[] result = solution.nextGreaterElement(nums1, nums2);

        // Output the results
        for (int num : result) {
            System.out.print(num + " "); // Output: -1 3 -1
        }
    }


    // next greator element 2 - circular array


    public int[] nextGreaterElements(int[] nums) {

        Stack<Integer> stack = new Stack<>();
        int n = nums.length;
        int[] result = new int[n];
        // Map<Integer, Integer> map = new HashMap<>();

        // Actually, filling the array with -1 initially does not increase the time
        // complexity. The overall time complexity remains O(n) even when you initialize
        // the result array, because:
        // Initialization of the result array: Setting all elements of the result array
        // to -1 is an O(n) operation. This is done in a single pass through the array.
        // Main processing loop: The main logic of the algorithm that involves
        // traversing the array twice (from 2n - 1 down to 0) also has a time complexity
        // of O(4n), as each element is pushed and popped from the stack at most once

        for (int i = 0; i < n; i++) {
            result[i] = -1;
        }

        // using the hypotheical double array approach by playig the indexes to mimic
        // the double array
        // after the i has crossed its orgianl length the i % n = gives the indexes from
        // zero onwards
        // like restarting the array, without using the extra space.

        for (int i = 0; i < n; i++) {
            result[i] = -1;
        }

        // Traverse the array twice to mimic a circular array
        for (int i = 2 * n - 1; i >= 0; i--) {
            // Pop elements from the stack that are smaller than or equal to the current
            // element
            while (!stack.isEmpty() && nums[stack.peek()] <= nums[i % n]) {
                stack.pop();
            }

            // If we are in the first iteration (i < n), update the result array
            if (i < n) {
                if (!stack.isEmpty()) {
                    result[i] = nums[stack.peek()];
                }
            }

            // Push the current index onto the stack
            stack.push(i % n);
        }

        return result;

    }


}


