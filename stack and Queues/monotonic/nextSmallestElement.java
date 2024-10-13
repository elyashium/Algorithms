package monotonic;


import java.util.*;

public class nextgreatorElement {
    public int[] prevSmaller(int[] A) {
        Stack<Integer> st = new Stack<>();
        int n = A.length;
        int[] result = new int[n];  // Array to store results

        // Iterate over all elements in the array A
        for (int i = 0; i < n; i++) {
            // Pop elements from the stack until we find a smaller one
            while (!st.isEmpty() && A[i] <= st.peek()) {
                st.pop();
            }

            // If the stack is empty, no smaller element was found
            if (st.isEmpty()) {
                result[i] = -1; // No previous smaller element
            } else {
                // The top of the stack is the previous smaller element
                result[i] = st.peek();
            }

            // Push the current element onto the stack for future comparisons
            st.push(A[i]);
        }

        // Return the result array with previous smaller elements
        return result;
    }
}

