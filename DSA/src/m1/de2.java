package m1;

public class de2 {
    public static void main(String[] args) {
        int n = 5; // Number of elements
        int[] arr = {1, 2, 3, 4, 5}; // Input array
        int k = 2; // Subarray size

        // Initialize an array to store the minimum values of subarrays
        int[] minValues = new int[n - k + 1];

        // Iterate over the subarrays of size k
        for (int i = 0; i <= n - k; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = i; j < i + k; j++) {
                min = Math.min(min, arr[j]);
            }
            minValues[i] = min;
        }

        // Calculate the maximum value from the minValues array
        int result = Integer.MIN_VALUE;
        for (int value : minValues) {
            result = Math.max(result, value);
        }

        System.out.println("The maximum of the minimum values of subarrays of size " + k + " is " + result + ".");
    }
}


