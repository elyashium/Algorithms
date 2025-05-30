package Binary Search;


class Solution {
    public int findMin(int[] nums) {
        int s = 0;
        int e = nums.length - 1;

        while (s < e) {
            int mid = s + (e - s) / 2;
            if (nums[mid] == nums[s] && nums[mid] == nums[e]) {
                s++;
                e--;
                //additional check to shrink the window where we are checking things
            } else if (nums[mid] > nums[e]) {
                s = mid + 1;
            } else {
                e = mid;
            }
        }
        return nums[s];

    }
}