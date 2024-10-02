public class validParanthesis {
        public boolean isValid(String s) {

            Stack<Character> stack = new Stack<Character>();

            for (char c : s.toCharArray()) {
                if (c == '(' || c == '[' || c == '{') {
                    stack.push(c);
                } else { // If the character is a closing bracket
                    if (stack.isEmpty()) {
                        return false;
                    }
                    char top = stack.peek();
                    if ((c == ')' && top == '(') || (c == ']' && top == '[') || (c == '}' && top == '{')) {
                        stack.pop();
                    } else {
                        return false;
                    }
                }
            }
            // If the stack is empty, all opening brackets have been closed, so return true
            // Otherwise, there are unmatched opening brackets, so return false
            return stack.isEmpty();
        }
    }

