class Solution {
    public int maximizeGreatness(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[count] < nums[i]) {
                ++count;
            }
        }
        return count;

    }
}