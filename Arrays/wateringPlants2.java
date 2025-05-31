class Solution {
    public int minimumRefill(int[] plants, int capacityA, int capacityB) {
        int n = plants.length;
        int refills = 0;
        int waterA = capacityA;
        int waterB = capacityB;

        for (int i = 0, j = n - 1; i < j; i++, j--) {
            if (waterA < plants[i]) {
                refills++;
                waterA = capacityA;
            }
            waterA = waterA-plants[i];

            if (waterB < plants[j]) {
                refills++;
                waterB = capacityB;
            }
            waterB = waterB- plants[j];
        }

        
        if (n % 2 == 1) {
            //checking for odd places since the loop stops if it encounters an
            //even number of plants, the middle element is alawys left out. 
            //so whoever is left with more water ends up refilling it.
            int mid = n / 2;
            if (Math.max(waterA, waterB) < plants[mid]) {
                refills++;
            }
        }

        return refills;
    }
}
