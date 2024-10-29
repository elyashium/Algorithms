package monotonic;

public class removrKdigits {
        public String removeKdigits(String num, int k) {

            // greedy apporach
            // 1) keep the smallest numbers in the start,
            // 2) remove all the largest numbers k times

            Stack<Character> st = new Stack<>();
            int n = num.length();

            for (int i = 0; i < n; i++) {
                char c = num.charAt(i);

                while (!st.isEmpty() && k > 0 && (st.peek() - '0') > (c - '0')) {
                    st.pop();
                    k--;
                }
                st.push(c);
            }

            // Handle remaining removals
            while (k > 0) {
                st.pop();
                k--;
            }

            // Build the resulting string from the stack
            StringBuilder res = new StringBuilder();
            while (!st.isEmpty()) {
                res.append(st.pop());
            }

            // Reverse the result since stack pops in reverse order
            res.reverse();

            // Remove leading zeros
            while (res.length() > 1 && res.charAt(0) == '0') {
                res.deleteCharAt(0);
            }

            return res.length() == 0 ? "0" : res.toString();
        }
    }


