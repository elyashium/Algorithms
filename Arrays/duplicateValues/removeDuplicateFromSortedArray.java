//java solution

class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0; // Edge case: If the array is empty, return 0

        int j = 1; // Pointer to track the position of unique elements

        // Start from the second element and check for duplicates
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) { // If current element is different from the previous one
                nums[j] = nums[i]; // Store unique element in the new position
                j++; // Move pointer forward
            }
        }

        return j; // New length of unique elements in the array
    }
}



//python solution

class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        j = 1
        for i in range(1, len(nums)):
            if nums[i] != nums[i - 1]:
                nums[j] = nums[i]
                j += 1
        return j


//javascript solution