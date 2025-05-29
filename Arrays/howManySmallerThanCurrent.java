//brute force 

class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int count =0;
        int[] ans = new int[nums.length];
       

        for(int i =0; i<nums.length; i++){
           
            for(int j =0; j<nums.length; j++){
           
                if(i != j){
                    if(nums[i] > nums[j]){
                        count++;
                    }
                }
                
            }
            ans[i] = count;
            count =0;
        }
        return ans;
        
    }
}


//optimised 

//store the count in a bucket and take the running sum.

class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int count[] = new int[101];
        int res[] = new int[nums.length];
        //the restrictions is for numbers upto 100.

        for (int i = 0; i < nums.length; i++) {
            count[nums[i]]++;
        }
        //storing the number of occurences in the count array.
        for (int i = 1; i <= 100; i++) {
            //prefix sum.
            count[i] = count[i] + count[i - 1];

        }
        //populating the final result.
        for (int i = 0 ; i < nums.length; i++) {
           if (nums[i] == 0) {
                res[i] = 0;
            } else {
                res[i] = count[nums[i] - 1]; // Count of numbers less than nums[i]
            }
        }
        return res;
    }
}