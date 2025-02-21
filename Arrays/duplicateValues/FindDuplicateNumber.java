//java solution

//can be solved with this containsDuplicate solution as well 
public static int findDuplicate_set(int[] nums) {
    Set<Integer> set = new HashSet<>();
    int len = nums.length;
    for (int i = 0; i < len; i++) {
        if (!set.add(nums[i])) {
            return nums[i];
        }
    }

    return len;
}


// #2 tortoise hare method 


class Solution {
    public int findDuplicate(int[] nums) {
        int slow = nums[0];
        int fast = nums[0];

        while (true) {
            slow = nums[slow];
            fast = nums[nums[fast]];

            if (slow == fast) {
                break;
            }
        }

        int slow2 = nums[0];

        while (slow != slow2) {
            slow = nums[slow];
            slow2 = nums[slow2];
        }

        return slow;        
    }
}




//python solution


class Solution:
    def findDuplicate(self, nums: List[int]) -> int:
        slow = nums[0]
        fast = nums[0]
        
        while True:
            slow = nums[slow]
            fast = nums[nums[fast]]
            if slow == fast:
                break
        
        slow2 = nums[0]
        while slow != slow2:
            slow = nums[slow]
            slow2 = nums[slow2]

        return slow



//javascript solution


/**
 * @param {number[]} nums
 * @return {number}
 */
var findDuplicate = function(nums) {
    let slow = nums[0];
    let fast = nums[0];

    while (true) {
        slow = nums[slow];
        fast = nums[nums[fast]];

        if (slow === fast) {
            break;
        }
    }

    let slow2 = nums[0];

    while (slow !== slow2) {
        slow = nums[slow];
        slow2 = nums[slow2];
    }

    return slow;    
};