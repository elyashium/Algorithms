class Solution {
    public int minimumDeletions(int[] nums) {

        if (nums.length == 1) {
            return 1;
        }

        int minVal = nums[0];
        int maxVal = nums[0];

        int min = 0;   // index of min
        int max = 0;   // index of max

        // find min index and max index in one loop
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < minVal) {
                minVal = nums[i];
                min = i;
            } else if (nums[i] > maxVal) {
                maxVal = nums[i];
                max = i;
            }
        }

        int minDel = 0;
        int maxDel = 0;

        int left = 0;
        int right = nums.length - 1;

        
        int mid = (right - left) / 2;


        // for minimum element deletions
        if (min <= mid) {
            minDel = min - left + 1;
        } else {
            minDel = right - min + 1;
        }

        // for maximum element deletions
        if (max <= mid) {
            maxDel = max - left + 1;
        } else {
            maxDel = right - max + 1;
        }

        // since deletions are independent paths,
        // take the minimum of the required combined paths:
        int leftPath = Math.max(min + 1, max + 1);
        int rightPath = Math.max(nums.length - min, nums.length - max);
        int bothSides = (min < max)
                        ? (min + 1 + nums.length - max)
                        : (max + 1 + nums.length - min);

        return Math.min(leftPath, Math.min(rightPath, bothSides));
    }

}
