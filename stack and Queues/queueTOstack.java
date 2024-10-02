import java.util.LinkedList;
import java.util.Queue;

public class queueTOstack {
    public static void main(String[] args) {

        // Creating an instance of the outer class
        queueTOstack qts = new queueTOstack();

        // Creating an instance of the inner class 'stack'
        stack s = qts.new stack();

        s.push(3);
        s.push(2);
        s.push(4);
        s.push(1);

        System.out.println("Top of the stack: " + s.top());
        System.out.println("Size of the stack before removing element: " + s.size());
        System.out.println("The deleted element is: " + s.pop());
        System.out.println("Top of the stack after removing element: " + s.top());
        System.out.println("Size of the stack after removing element: " + s.size());
    }

    class stack {
        // Use LinkedList to implement the queue
        Queue<Integer> q = new LinkedList<>();

        void push(int x) {
            q.add(x);

            for (int i = 1; i < q.size(); i++) {
                q.add(q.remove());  // Rotate the queue to move the last added element to the front
            }
        }

        int pop() {
            return q.remove();  // Removes the front element of the queue
        }

        int top() {
            return q.peek();  // Returns the front element of the queue
        }

        int size() {
            return q.size();  // Returns the size of the queue
        }
    }
}
