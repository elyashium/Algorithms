//not optimal the time complexity will be O(Min(Limit,N))

class Solution {
    public long distributeCandies(int n, int limit) {
        long res = 0;
        for (int i = 0; i <= Math.min(limit, n); i++) {
            if (n - i <= 2 * limit)
                res += Math.min(n - i, limit) - Math.max(0, n - i - limit) + 1;
        }
        return res;
    }
}

//optimal relies on heavy combinatorics and maths 