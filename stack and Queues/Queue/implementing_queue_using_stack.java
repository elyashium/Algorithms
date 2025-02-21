class MyQueue {

    // approcah 1: O(N) push complexity

    private Stack<Integer> input;
    private Stack<Integer> output;

    public MyQueue() {
        
        input = new Stack<>();
        output = new Stack<>();
    }

    public void push(int x) {

        while (input.empty() == false) {
            output.push(input.peek());
            input.pop();
        }
        // Insert the desired element in the stack input
        input.push(x);

        while (output.empty() == false) {
            input.push(output.peek());
            output.pop();
        }

    }

    public int pop() {
         if (input.empty()) {
             return -1;
            }
            int val = input.peek();
            input.pop();
            return val;


    }

    public int peek() {
         if (input.empty()) {
            return -1;

            }
            return input.peek();
    }

    public boolean empty() {
        return input.empty() && output.empty();

    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
