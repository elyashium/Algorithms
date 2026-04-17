import java.util.*;

public class LongestSubstringwithoutrepeating {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        System.out.println("Length of longest substring without repeating characters: "
                + lengthOfLongestSubstring(input));
    }

    public static int lengthOfLongestSubstring(String s) {

        int n = s.length();
        int left = 0;
        int maxLength = 0;

        // use Character, not String
        HashSet<Character> set = new HashSet<>();

        for (int i = 0; i < n; i++) {

            // shrink window until no duplicate
            while (set.contains(s.charAt(i))) {
                set.remove(s.charAt(left));  // remove from left
                left++;
            }

            set.add(s.charAt(i));

            // window size calculation
            maxLength = Math.max(maxLength, i - left + 1);
        }

        return maxLength;
    }
}