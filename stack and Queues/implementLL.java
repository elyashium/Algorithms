public class implementLL {

    // QueueNode class represents each node in the Queue
    class QueueNode {
        int val;
        QueueNode next;

        QueueNode(int data) {
            val = data;
            next = null;
        }
    }

    // Queue class for the linked list implementation of a queue
    class Queue {
        QueueNode Front = null, Rear = null;
        int size = 0;

        // Method to check if the queue is empty
        boolean Empty() {
            return Front == null;
        }

        // Method to peek the front element of the queue
        int Peek() {
            if (Empty()) {
                System.out.println("Queue is Empty");
                return -1;
            } else {
                return Front.val;
            }
        }

        // Method to enqueue an element into the queue
        void Enqueue(int value) {
            QueueNode Temp = new QueueNode(value);
            if (Temp == null) { // When heap is exhausted
                System.out.println("Queue is Full");
            } else {
                if (Front == null) {
                    Front = Temp;
                    Rear = Temp;
                } else {
                    Rear.next = Temp;
                    Rear = Temp;
                }
                System.out.println(value + " Inserted into Queue");
                size++;
            }
        }

        // Method to dequeue an element from the queue
        void Dequeue() {
            if (Front == null) {
                System.out.println("Queue is Empty");
            } else {
                System.out.println(Front.val + " Removed From Queue");
                Front = Front.next;
                size--;
            }
        }
    }

    // Stack class for the linked list implementation of a stack
    class Stack {
        class StackNode {
            int data;
            StackNode next;

            StackNode(int d) {
                data = d;
                next = null;
            }
        }

        StackNode top;
        int size;

        // Constructor for stack
        Stack() {
            this.top = null;
            this.size = 0;
        }

        // Method to push an element into the stack
        public void stackPush(int x) {
            StackNode element = new StackNode(x);
            element.next = top;
            top = element;
            System.out.println("Element pushed: " + x);
            size++;
        }

        // Method to pop an element from the stack
        public int stackPop() {
            if (top == null) {
                System.out.println("Stack is empty");
                return -1;
            }
            int topData = top.data;
            top = top.next;
            size--;
            return topData;
        }

        // Method to get the size of the stack
        public int stackSize() {
            return size;
        }

        // Method to check if the stack is empty
        public boolean stackIsEmpty() {
            return top == null;
        }

        // Method to print the elements in the stack
        public void printStack() {
            StackNode current = top;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Creating an instance of implementLL to access inner classes
        implementLL impl = new implementLL();

        // Testing the Stack functionality
        Stack s = impl.new Stack();
        s.stackPush(10);
        s.stackPush(20);
        s.printStack();  // Output: 20 10
        System.out.println("Element popped: " + s.stackPop());  // Output: 20
        System.out.println("Stack size: " + s.stackSize());  // Output: 1
        System.out.println("Stack is empty: " + s.stackIsEmpty());  // Output: false

        // Testing the Queue functionality
        Queue q = impl.new Queue();
        q.Enqueue(10);
        q.Enqueue(20);
        q.Enqueue(30);
        q.Dequeue();  // Output: 10 Removed From Queue
        System.out.println("Queue size: " + q.size);  // Output: 2
        System.out.println("Queue Peek: " + q.Peek());  // Output: 20
    }
}

