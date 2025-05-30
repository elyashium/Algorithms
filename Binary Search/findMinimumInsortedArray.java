package Binary Search;


class Solution {
    public int findMin(int[] nums) {

        int s = 0;
        int e = nums.length - 1;

        while (s < e) {

            int mid = s + (e - s) / 2;

            if (nums[mid] > nums[e]) {
                //if the middle is greater than end(which is unlikely in binary search, as it
                //  requires  the array to be sorted) it means the array has been roated and the smallest lies in right
                s = mid + 1;
            } else {
                //other wise it lies in the right 

                e = mid;

            }
        }

        return nums[s];

    }
}