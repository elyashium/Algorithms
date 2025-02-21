
class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int score = 0;

        for(int i = 0; i < k; ++i)
            score += cardPoints[i];

        int max = score;

        for(int i = cardPoints.length - 1; i >= cardPoints.length - k; --i) {
            score += cardPoints[i];
            score -= cardPoints[k - cardPoints.length + i];
            max = Math.max(score, max);
        }

        return max;
    }
}
