//java solution

class Solution {
    public int missingNumber(int[] nums) {

        int n = nums.length;
        int sum = n*(n+1)/2;
        //expected sum 

        int s2 = 0;
        for (int i : nums) {
            s2 = s2 + i;
            //sum of given array 

        }
        return sum - s2; //the difference is the missing number
    }

}


//python solution

class Solution:
    def missingNumber(self, nums: List[int]) -> int:
        n = len(nums)
        sum = n * (n + 1) // 2
        sum2 = 0
        for i in nums:
            sum2 = sum2 + i

        return sum - sum2
