package prefix_infix_postfix;

import java.util.*;

public class infixToPrefix {

    // A utility function to return precedence of a given operator
    // Higher returned value means higher precedence
    static int Prec(char ch) {
        switch (ch) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }

    // A function to reverse a string and handle brackets' positions
    static String revString(String str) {
        StringBuilder reversed = new StringBuilder(str.length());

        for (int i = str.length() - 1; i >= 0; i--) {
            char c = str.charAt(i);
            if (c == '(')
                reversed.append(')');
            else if (c == ')')
                reversed.append('(');
            else
                reversed.append(c);
        }
        return reversed.toString();
    }

    // The main function to convert infix expression to prefix expression
    static String infixToPrefix(String exp) {
        // First, reverse the infix expression
        exp = revString(exp);

        // Result for storing the prefix expression
        StringBuilder result = new StringBuilder();

        // Stack for storing operators
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < exp.length(); i++) {
            char c = exp.charAt(i);

            // If the scanned character is an operand, add it to result
            if (Character.isLetterOrDigit(c)) {
                result.append(c);
            }
            // If the scanned character is '(', push it to stack
            else if (c == '(') {
                stack.push(c);
            }
            // If the scanned character is ')', pop until '(' is found
            else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    result.append(stack.pop());
                }
                stack.pop();  // Remove '(' from stack
            }
            // If the scanned character is an operator
            else {
                // Handle associativity for '^'
                while (!stack.isEmpty() && Prec(c) <= Prec(stack.peek())) {
                    if (c == '^' && stack.peek() == '^') break; // Right associative for '^'
                    result.append(stack.pop());
                }
                stack.push(c);
            }
        }

        // Pop all the remaining operators from the stack
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }

        // Finally, reverse the result string to get the prefix expression
        return revString(result.toString());
    }

    public static void main(String[] args) {
        String infix = "(A-B/C)*(A/K-L)";
        System.out.println("Prefix Expression: " + infixToPrefix(infix));
    }
}
