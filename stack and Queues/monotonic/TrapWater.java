package monotonic;

public class TrapWater {

    //arrayy prefix and suffix approach
    public int trap(int[] height) {

        //1st apporach

        int n = height.length;
        if (n == 0) return 0;

        int[] left = new int[n];
        int[] right = new int[n];
        int storedWater = 0;

        // Fill left array
        left[0] = height[0];
        for (int i = 1; i < n; i++) {
            left[i] = Math.max(left[i - 1], height[i]);
        }

        // Fill right array
        right[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            right[i] = Math.max(right[i + 1], height[i]);
        }

        // Calculate trapped water
        for (int i = 0; i < n; i++) {
            int minHeight = Math.min(left[i], right[i]);
            storedWater += minHeight - height[i];
        }

        return storedWater;
    }


    //time complexity is 

    //2nd approch through stack

}
