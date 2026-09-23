class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        Arrays.sort(nums);

        int current = 1;
        int longest = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                // Duplicate — don't break the streak
                continue;
            }

            if (nums[i] == nums[i - 1] + 1) {
                // Consecutive number
                current++;
            } else {
                // Sequence has broken
                current = 1;
            }

            longest = Math.max(longest, current);
        }

        return longest;
    }
}