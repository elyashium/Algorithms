class Solution {
    public String largestOddNumber(String num) {

        int n = num.length();
        char[] c = num.toCharArray();

        // Because the rightmost odd digit determines the longest odd prefix.

        // If we started from the left, we’d find the first odd digit, but that wouldn’t
        // give us the largest possible number.
        for (int i = n - 1; i >= 0; i--) {
            if (c[i] % 2 != 0) {

                return num.substring(0, i + 1);

            }
        }
        return "";

    }
}
