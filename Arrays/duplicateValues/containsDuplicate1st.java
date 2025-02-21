//java solution
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        
        for (int num : nums) {
            if (!set.add(num)) { // If add() returns false, duplicate exists
                return true;
            }
        }
        
        return false; // No duplicates found
    }
}



//python solution

class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        duplicate = set(nums)
        if(len(nums) ==  len(duplicate)) : return False
        else: return True




//javascript solution 

function containsDuplicate(nums) {
    const set = new Set();
    
    for (let num of nums) {
        if (set.has(num)) {
            return true; // Duplicate found
        }
        set.add(num);
    }
    
    return false; // No duplicates
}
