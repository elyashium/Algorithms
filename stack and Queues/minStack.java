public class minStack {

    private Node head;

    //Linkedlist approach

    public void push(int x) {
        if (head == null) head = new Node(x, x, null);
        else head = new Node(x, Math.min(x, head.min), head);
    }

    public void pop() {
        head = head.next;
    }

    public int top() {
        return head.val;
    }

    public int getMin() {
        return head.min;
    }

    private class Node {
        int val;
        int min;
        Node next;

        private Node(int val, int min, Node next) {
            this.val = val;
            this.min = min;
            this.next = next;
        }
    }


// pair approach


    // Custom Pair class to store (value, minimum value)
    class Pair<U, V> {
        public final U first;
        public final V second;

        public Pair(U first, V second) {
            this.first = first;
            this.second = second;
        }
    }

    class MinStack {

        private Stack<Pair<Integer, Integer>> st;


        public MinStack() {
            st = new Stack<>();
        }


        public void push(int val) {
            if (st.empty()) {
                // If the stack is empty, push the value as both the element and the current minimum
                st.push(new Pair<>(val, val));
            } else {
                // Otherwise, push the value and the minimum of the current value and the current minimum
                st.push(new Pair<>(val, Math.min(val, st.peek().second)));
            }
        }

        // Pop the top element off the stack
        public void pop() {
            if (!st.empty()) {
                st.pop();
            }
        }

        // Get the top element of the stack
        public int top() {
            if (!st.empty()) {
                return st.peek().first;
            }
            return -1;  // Return -1 if stack is empty (could also throw an exception based on your preference)
        }

        // Get the current minimum element in the stack
        public int getMin() {
            if (!st.empty()) {
                return st.peek().second;
            }
            return -1;  // Return -1 if stack is empty (could also throw an exception)
        }
    }



    //approach 3 : optimised
}
