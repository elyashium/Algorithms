import java.util.*;

class solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String input = sc.nextLine();

        System.out.println("the longest pallingdromic substring is " + longestPallingdromeSubStr(input));
        sc.close();
    }

    public static String longestPallingdromeSubStr(String s){

        String longest = "";
        for(int i =0; i< s.length(); i++){

            //odd numbers of pallingdrome the middle is at i 
            String odd = Expand(s,i,i);
            //even number of pallingfrome when expanded, cnetre is between i and i+1
            String even = Expand(s,i, i+1);

            String curr = (even.length()>odd.length())? even : odd;

              if (curr.length() > longest.length()) {
                longest = curr;
            }
            
        }
        return longest;

    }

    public String Expand(String s, int left, int right){
       
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        // Return the palindrome substring
        return s.substring(left + 1, right);
    }

}