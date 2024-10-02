
import java.util.*;

    //approach 1 : Using two Stacks where push operation is O(N)


    class MyQueue {
        Stack < Integer > input = new Stack < > ();
        Stack < Integer > output = new Stack < > ();
        /** Initialize your data structure here. */
        public MyQueue() {

        }

        /** Push element x to the back of queue. */
        public void push(int x) {
            while (input.empty() == false) {
                output.push(input.peek());
                input.pop();
            }
            // Insert the desired element in the stack input
            System.out.println("The element pushed is " + x);
            input.push(x);
            // Pop out elements from the stack output and push them into the stack input
            while (output.empty() == false) {
                input.push(output.peek());
                output.pop();
            }

        }

        /** Removes the element from in front of queue and returns that element. */
        public int pop() {
            // shift input to output
            if (input.empty()) {
                System.out.println("Stack is empty");

            }
            int val = input.peek();
            input.pop();
            return val;

        }

        /** Get the front element. */
        public int peek() {
            // shift input to output
            if (input.empty()) {
                System.out.println("Stack is empty");

            }
            return input.peek();
        }


        int size() {
            return input.size();
        }


        //apporach 2 : top and pop functions are expanded while push is optimised

        public void push2(int x) {
            System.out.println("The element pushed is " + x);
            input.push(x);
        }

        /** Removes the element from in front of queue and returns that element. */
        public int pop2() {
            // shift input to output
            if (output.empty())
                while (input.empty() == false) {
                    output.push(input.peek());
                    input.pop();
                }


            int x = output.peek();
            output.pop();
            return x;
        }

        /** Get the front element. */
        public int peek2() {
            // shift input to output
            if (output.empty())
                while (input.empty() == false) {
                    output.push(input.peek());
                    input.pop();
                }
            return output.peek();
        }
        int size2() {
            return (output.size() + input.size());
        }
    }

    class stackTOqueue {
        public static void main(String args[]) {
            MyQueue q = new MyQueue();
            q.push(3);
            q.push(4);
            System.out.println("The element poped is " + q.pop());
            q.push(5);
            System.out.println("The top element is " + q.peek());
            System.out.println("The size of the queue is " + q.size());

        }
    }

// LEETCODE CODE =>

//class MyQueue {
//
//    // approcah 1: O(N) push complexity
//
//    private Stack<Integer> input;
//    private Stack<Integer> output;
//
//    public MyQueue() {
//        input = new Stack<>();
//        output = new Stack<>();
//    }
//
//    public void push(int x) {
//
//        while (input.empty() == false) {
//            output.push(input.peek());
//            input.pop();
//        }
//        // Insert the desired element in the stack input
//        input.push(x);
//
//        while (output.empty() == false) {
//            input.push(output.peek());
//            output.pop();
//        }
//
//    }
//
//    public int pop() {
//        if (input.empty()) {
//            return -1;
//        }
//        int val = input.peek();
//        input.pop();
//        return val;
//
//
//    }
//
//    public int peek() {
//        if (input.empty()) {
//            return -1;
//
//        }
//        return input.peek();
//    }
//
//    public boolean empty() {
//        return input.empty() && output.empty();
//
//    }
//}





