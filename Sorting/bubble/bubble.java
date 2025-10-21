import java.util.*;

class solution{
    public static void main(String[] args) {
        //getting the input from user 
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the elements of array seperated by space");

       String line = sc.nextLine(); // Read the entire line of text
        String[] stringNumbers = line.split(" "); // Split the line into an array of strings

        //parsing the string to array 
        int[] arr = new int[stringNumbers.length];
         for (int i = 0; i < stringNumbers.length; i++) {
            arr[i] = Integer.parseInt(stringNumbers[i]); // Convert each string to an integer
        }

         bubbleSort(arr);

        // --- FIX 2: Correctly Printing the Array ---
        // Use the Arrays.toString() helper method to print the contents nicely.
        System.out.println("Sorted Array: " + Arrays.toString(arr));
        
        sc.close(); // Good practice to close the scanner
        
    }


     public static void bubbleSort(int[] nums) {
        int n = nums.length;
        boolean swapped;
        // The outer loop controls how many passes we make.
        // After `i` passes, the last `i` elements are already in their correct sorted places.
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            // The inner loop does the comparisons and swaps.
            // It compares adjacent elements: `nums[j]` and `nums[j+1]`.
            // The `- i - 1` is an optimization, because the largest elements are already at the end.
            for (int j = 0; j < n - i - 1; j++) {
                // To sort in ascending order (smallest to largest), swap if the left is bigger than the right.
                if (nums[j] > nums[j + 1]) {
                   
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                    swapped = true;
                }
            }
            // Optimization: If no two elements were swapped by inner loop, then array is sorted.
            if (!swapped) {
                break;
            }
        }
    }
    
    /* 
    // If you REALLY want a separate swap function, it MUST look like this:
    // It takes the whole array and the INDICES to swap.
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    // You would then call it from bubbleSort like this: swap(nums, j, j + 1);
    */

  
}