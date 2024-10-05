package prefix_infix_postfix;

import java.util.Stack;

public class postfixTOinfix {
    static String postToInfix(String exp) {

        //make sure the stack can store strings.

        Stack<String> st = new Stack<>();
//        StringBuilder result = new StringBuilder(); there is no need for a string

        for (int i = 0; i < exp.length(); i++) {
            char c = exp.charAt(i);

            if (Character.isLetterOrDigit(c)) {
                st.push(Character.toString(c));
            }

            else {
                String t1 = st.peek();
                st.pop();
                String t2 = st.peek();
                st.pop();

                String res = "(" + t2 + c + t1 + ")";

                st.push(res);
            }
        }
        return st.pop();
    }

    public static void main(String[] args) {
        String postfix = "ab+c*"; // Example postfix expression
        String infix = postToInfix(postfix);
        System.out.println("Infix expression: " + infix);
    }
}
