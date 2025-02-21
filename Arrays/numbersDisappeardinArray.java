//java solution

//tc : O(N)
//SC : O(N)

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        ArrayList<Integer> res = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        // Step 1: Populate the HashMap with the frequency of each number in the array
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Step 2: Iterate through the range [1, n] and check for missing numbers
        for (int i = 1; i <= n; i++) {
            if (!map.containsKey(i)) {
                res.add(i); // Step 3: Add missing numbers to the result list
            }
        }

        return res;
    }
}


// this can be further optimised by leveraging the input array itself to track which numbers are present or missing.
// this only works because, the range of numbers are between (1,n) means that each number can be
//mapped to the unique keys indices


// tc : O(N)
// sc : O(1) constant space, (in place marking)

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        ArrayList<Integer> res = new ArrayList<>();

        //  Mark indices as "seen" by making values negative
        for (int num : nums) {
            int index = Math.abs(num) - 1; // Map the number to its corresponding index
            if (nums[index] > 0) {
                nums[index] = -nums[index]; // Mark as seen
            }
        }

        // Collect indices with positive values (missing numbers)
        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) {
                res.add(i + 1); // Add the missing number (index + 1)
            }
        }

        return res;
    }
}


//python solution

    def findDisappearedNumbers(self, nums: List[int]) -> List[int]:
       
        for num in nums:
            index = abs(num) - 1  
            if nums[index] > 0:  
                nums[index] = -nums[index]  # Mark as seen

       
        res = []
        for i in range(len(nums)):
            if nums[i] > 0:
                res.append(i + 1)  

        return res

//javascript solution