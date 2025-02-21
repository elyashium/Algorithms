// //Iterate through the array and for each number, calculate the index as abs(num) - 1.
// If the value at this index is negative, it means the number has already been seen, so add it to the result list.
// Otherwise, negate the value at this index to mark it as seen.
// Use abs(num) to handle cases where the number has already been negated.


//java solution

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        List<Integer> result = new ArrayList<>();
        for (int num : nums) {
            if (seen.contains(num)) {
                result.add(num);
            } else {
                seen.add(num);
            }
        }
        return result;
    }
}



//python solution

class Solution:
    def findDuplicates(self, nums: List[int]) -> List[int]:
        mp = {}
        for i in nums:
            if i not in mp:
                mp[i] = 1
            else:
                mp[i] += 1
        
        res = []
        for i, v in mp.items():
            if v == 2:
                res.append(i)
        return res


//javascript solution

var findDuplicates = function(nums) {
    let seen = new Set();
    let arr = [];

    for(let num of nums){
        if(seen.has(num)){
            arr.push(num); // if already seen add it to the final ans array
        }
        else{
            seen.add(num) //else add it to the set
        }
    }
    return arr;
};