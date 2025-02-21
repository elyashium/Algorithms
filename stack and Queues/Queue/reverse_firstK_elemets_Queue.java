class GfG {
    // Function to reverse first k elements of a queue.
    public Queue<Integer> modifyQueue(Queue<Integer> q, int k) {
        
        int n = q.size();
        
        if(q.isEmpty() || k>n || k<0){
            return q;
        }
        Stack<Integer> stack = new Stack<Integer>();
        //move the first k elemets to a stack.
        for(int i =0; i<k; i++){
           stack.push(q.poll());
          
        }
        
        //add the elements from the stack back to the queue 
        //satk will out LIFO and q will recieve FIFO
        while(!stack.isEmpty()){
            q.add(stack.pop());
        }
        
        //move the rest of the elements of queue back to the queue
        int remainSize = n-k;
        for(int i =0; i<remainSize; i++){
            q.add(q.poll()); // poll() removes and returns the front element
            
        }
        
        return q;
    }
}