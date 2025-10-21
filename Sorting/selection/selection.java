import java.util.*;

class solution{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("eneter the elements of the array in space seperated :");
        String st = sc.nextLine();
        String[] words = st.split(" ");


        int[] arr = new int[words.length];
        for(int i =0; i<arr.length; i++){
            arr[i] = Integer.parseInt(words[i]);
        }

        selectionSort(arr);

        System.out.println("Sorted Array: " + Arrays.toString(arr));


        sc.close();

        
    }

    public static void selectionSort(int[] nums){
         int n = nums.length;

        // One by one move the boundary of the unsorted subarray
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in the unsorted array [i...n-1]
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (nums[j] < nums[minIndex]) {
                    minIndex = j; // Found a new minimum
                }
            }

            // Swap the found minimum element with the first element of the unsorted part
            int temp = nums[minIndex];
            nums[minIndex] = nums[i];
            nums[i] = temp;
    }
}