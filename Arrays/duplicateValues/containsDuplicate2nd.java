//java solution 

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>(); // Stores number as key and its last index as value

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i]) && i - map.get(nums[i]) <= k) {
                return true; // Found a duplicate within range k
            }
            // Update the last seen index of the number
            map.put(nums[i], i);
        }

        return false; // No duplicates found within k distance
    }
}


//python solution


class Solution:
    def containsNearbyDuplicate(self, nums: List[int], k: int) -> bool:
        num_indices = {}  # Dictionary to store number and its last seen index
        
        for i, num in enumerate(nums):
            if num in num_indices and i - num_indices[num] <= k:
                return True  # Found a duplicate within range k
            num_indices[num] = i  # Update the index of the current number
        
        return False  # No nearby duplicates found



//javascript solution

var containsNearbyDuplicate = function(nums, k) {
  
    let numIndices = new Map(); // Map to store number and its last index

    for (let i = 0; i < nums.length; i++) {
        if (numIndices.has(nums[i]) && i - numIndices.get(nums[i]) <= k) {
            return true; // Found a duplicate within range k
        }
        numIndices.set(nums[i], i); // Update the last seen index of nums[i]
    }
    
    return false; // No nearby duplicates found
};
