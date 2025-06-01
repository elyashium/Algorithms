class Solution {
    public int distributeCandies(int n, int limit) {
        int min = Math.max(0, n - 2 * limit); // Minimum candies first child can take
        int max = Math.min(n, limit);         // Maximum candies first child can take
        int ways = 0;

        for (int i = min; i <= max; i++) {
            int N = n - i; // Remaining candies after giving i to first child

            int minCh2 = Math.max(0, N - limit);  // Minimum for second child
            int maxCh2 = Math.min(N, limit);      // Maximum for second child

            ways += maxCh2 - minCh2 + 1; // Valid combinations for second and third child
        }

        return ways;
    }
}