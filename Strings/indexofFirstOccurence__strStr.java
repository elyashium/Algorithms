class Solution {
    public int strStr(String haystack, String needle) {

        // we have to find the first time needle is found in haystack
        // and return the index. and -1 if its not found.
        // its given the that needle and haystack only contain lowercase

        if (needle.isEmpty())
            return 0;
        if (needle.length() > haystack.length())
            return -1;

        for (int i = 0; i <= haystack.length() - needle.length(); i++) {

            if (haystack.substring(i, i + needle.length()).equals(needle)) {
                return i;
            }
        }
        return -1;

    }
}