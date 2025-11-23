import java.util.*;

public class reverseArray {
    public static void reverseArray(ArrayList<Integer> arr, int m) {
        int left = m + 1;
        int right = arr.size() - 1;

        while (left < right) {
            int temp = arr.get(left);
            arr.set(left, arr.get(right));
            arr.set(right, temp);

            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
        reverseArray(arr, 3);
        System.out.println(arr);   // Output → [1, 2, 3, 4, 6, 5]
    }
}
