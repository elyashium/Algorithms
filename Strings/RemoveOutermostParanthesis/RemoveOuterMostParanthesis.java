
//stack based solution 
import java.util.*;

class solution {
    public static void RemoveOuterMostParanthesis(String s){
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for(char ch: s.toCharArray()){
            if(ch == "("){
                //if stack is not empty then its not a empty stack
                if(!stack.isEmpty()){
                    sb.append(ch);
                }
                stack.push(ch);
                else{
                    stack.pop();
                     // If stack is not empty after popping, this ')' is not an outermost one
                     if(!stack.isEmpty()){
                        sb.append(ch);
                     }
                }
            }
            return sb.toString();
        }
    }
}

// without stack keeping track of the counters

class solution {
    public static void RemoveOuterMostParanthesis(String s) {
        int count = 0;
        int n = s.length();
        char[] ch = s.toCharArray();
        StringBuilder sb = new StringBuilder();

        if (n < 2) {
            return "";
        }

        for (int i = 0; i < n; i++) {

            if (c[i] == '(') {
                if (x > 0) {
                    sb.append('(');
                }
                x++;
            }

            else {
                x--;

                if (x > 0) {
                    sb.append(')');
                }

            }
        }

        return sb.toString();
    }
}