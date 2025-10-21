import java.util.*;

class solution{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();

        String[] words = line.split(" ");
        int[] arr = new int[words.length];
        for(int i =0; i<arr.length; i++){
            arr[i] = Integer.parseInt(words[i]);
        } 

        mergeSort(arr);

        System.out.println("Sorted Array: " + Arrays.toString(sortedArr));
        sc.close();

    }


     public static int[] mergeSort(int[] nums) {
        int n = nums.length;
        // Base case for the recursion: an array with 0 or 1 elements is already sorted.
        if (n <= 1) {
            return nums;
        }

        // 1. Divide: Find the middle and create two subarrays.
        int mid = n / 2;
        int[] left = Arrays.copyOfRange(nums, 0, mid);
        int[] right = Arrays.copyOfRange(nums, mid, n);

        // 2. Conquer: Recursively sort both halves.
        int[] sortedLeft = mergeSort(left);
        int[] sortedRight = mergeSort(right);

        // 3. Combine: Merge the two sorted halves.
        return merge(sortedLeft, sortedRight);
    }

    
    private static int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int i = 0; // Pointer for left array
        int j = 0; // Pointer for right array
        int k = 0; // Pointer for result array

        // Compare elements from left and right, adding the smaller one to the result.
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                result[k++] = left[i++];
            } else {
                result[k++] = right[j++];
            }
        }

        // After the main loop, one of the arrays might have leftover elements.
        // Copy the remaining elements from the left array (if any).
        while (i < left.length) {
            result[k++] = left[i++];
        }

        // Copy the remaining elements from the right array (if any).
        while (j < right.length) {
            result[k++] = right[j++];
        }

        return result;
    }
}
