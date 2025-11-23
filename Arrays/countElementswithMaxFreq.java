//two appoaches 

//the 8 bit approach as the constraint say the array is only 100 elements 

class Solution {
    public int maxFrequencyElements(int[] nums) {
        byte[] freq = new byte[101];
        byte max = 0, res = 0;
        for (int n : nums) {
            byte f = ++freq[n];
            if (f > max) {
                max = f; res = f;
            } else if (f == max) 
                res += f;
        }
        return res;
    }
}


//hashmap version

import java.util.HashMap;

class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer, Integer> freq = new HashMap<>();

        int max = 0;
        int res = 0;

        for (int n : nums) {
            int f = freq.getOrDefault(n, 0) + 1;
            freq.put(n, f);

            if (f > max) {
                max = f;
                res = f;       // start counting again with the new max value
            } else if (f == max) {
                res += f;      // add this number's full freq if ties the max
            }
        }

        return res;
    }
}
