package monotonic;
import java.util.*;
class sumOFsubarray {

    static final long mod = 1000000007L; // 1e9 + 7

    // Find the previous smaller element
    public int[] previousSmaller(int[] arr) {
        int n = arr.length;
        int[] pse = new int[n];
        Stack<Integer> stk = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!stk.isEmpty() && arr[stk.peek()] >= arr[i]) {
                stk.pop();
            }
            pse[i] = (stk.isEmpty()) ? -1 : stk.peek();
            stk.push(i);  // Push the current index instead of value
        }
        return pse;
    }

    // Find the next smaller element
    public int[] nextSmaller(int[] arr) {
        int n = arr.length;
        int[] nse = new int[n];
        Stack<Integer> stk = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            while (!stk.isEmpty() && arr[stk.peek()] > arr[i]) {
                stk.pop();
            }
            nse[i] = (stk.isEmpty()) ? n : stk.peek();
            stk.push(i);  // Push the current index instead of value
        }
        return nse;
    }

    // Calculate the sum of subarray minimums
    public int sumSubarrayMins(int[] arr) {
        // int mod = (int) (1e9 + 7);
        long total = 0;
        int n = arr.length;

        int[] PSE = previousSmaller(arr);
        int[] NSE = nextSmaller(arr);

        for (int i = 0; i < n; i++) {
            int left = i - PSE[i];
            int right = NSE[i] - i;

            total = (total + (long) left * right * arr[i]) % mod;
        }
        return (int)total;
    }



// brute force

    int bruteFroce(int[]arr){
        //this is the brute froce approach
        //where i generate all subarrays and find mini and sum it up
        int n = arr.length;
        int sum = 0;
        int mod = (int)(1e9 + 7);

        for(int i = 0;i<n;i++){
            int min = arr[i];
            for(int j = i;j<n;j++){
                min = Math.min(arr[j], min);
                sum = (sum+min)%mod;
            }
        }
        return sum;

    }
}




