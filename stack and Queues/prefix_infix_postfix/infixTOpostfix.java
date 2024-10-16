import java.util.Stack;

class infixTOpostfix {

    // A utility function to return
    // precedence of a given operator
    // Higher returned value means
    // higher precedence
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

    // The main method that converts
    // given infix expression
    // to postfix expression.
    static String infixToPostfix(String exp) {
        // initializing empty String for result
        String result = new String("");

        // initializing empty stack
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < exp.length(); ++i) {
            char c = exp.charAt(i);

            // If the scanned character is an
            // operand, add it to output.
            if (Character.isLetterOrDigit(c))
                result += c;

                // If the scanned character is an '(',
                // push it to the stack.
            else if (c == '(')
                stack.push(c);

                // If the scanned character is an ')',
                // pop and output from the stack
                // until an '(' is encountered.
            else if (c == ')') {
                while (!stack.isEmpty() &&
                        stack.peek() != '(')
                    result += stack.pop();

                stack.pop();
            } else // an operator is encountered
            {
                while (!stack.isEmpty() && Prec(c) <=
                        Prec(stack.peek())) {

                    result += stack.pop();
                }
                stack.push(c);
            }

        }

        // pop all the operators from the stack
        while (!stack.isEmpty()) {
            if (stack.peek() == '(')
                return "Invalid Expression";
            result += stack.pop();
        }
        return result;
    }

    // Driver method
    public static void main(String[] args) {
        String exp = "(p+q)*(m-n)";
        System.out.println("Infix expression: " + exp);
        System.out.println("Prefix expression: " + infixToPostfix(exp));
        
    }
}



//GFG SOLUTION 




class Solution {
    // Function to convert an infix expression to a postfix expression.
    public static String infixToPostfix(String exp) {
        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<exp.length();i++){
            char ch = exp.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                sb.append(ch);
            }
            else if(ch=='(') st.push(ch);
            else if(ch==')'){
                while(!st.isEmpty() && st.peek()!='('){
                    sb.append(st.pop());
                }
            st.pop();
            }
            else{
                while(!st.isEmpty() && precedence(ch)<=precedence(st.peek())){
                    sb.append(st.pop());
                }
            st.push(ch);
            }
        }
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
    return sb.toString();
    }
    public static int precedence(char ch){
        if (ch=='^') return 3;
        else if(ch=='*' || ch=='/') return 2;
        else if(ch=='+' || ch=='-') return 1;
        else return -1;
    }
}
