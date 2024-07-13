package m1;

import java.util.Arrays;

public class MaxMinSubarray {

    public static int maxMin(int[] arr, int k) {
        Arrays.sort(arr); // Sort the array in ascending order
        int maxMin = Integer.MIN_VALUE;

        // Iterate through each subarray of size k
        for (int i = 0; i <= arr.length - k; i++) {
            int min = arr[i]; // Minimum element in the current subarray
            int max = arr[i + k - 1]; // Maximum element in the current subarray
            maxMin = Math.max(maxMin, max - min); // Update the maximum difference
        }

        return maxMin;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 2;
        int result = maxMin(arr, k);
        System.out.println("Maximum difference of minima in subarrays of size " + k + ": " + result);
    }
}
