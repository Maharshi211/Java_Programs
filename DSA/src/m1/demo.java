package m1;
import java.util.ArrayDeque;
import java.util.Deque;

public class demo {
    public static int maxOfMinSubarrays(int[] arr, int n, int k) {
        int[] left = new int[n];
        int[] right = new int[n];
        
        // Arrays to store indexes of the next smaller elements to the left and right of arr[i]
        Deque<Integer> stack = new ArrayDeque<>();
        
        // Calculate left[] array
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }
            left[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(i);
        }
        
        // Clear stack for next iteration
        stack.clear();
        
        // Calculate right[] array
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }
            right[i] = stack.isEmpty() ? n : stack.peek();
            stack.push(i);
        }
        
        // Calculate result
        int result = Integer.MIN_VALUE;
        for (int i = 0; i <= n - k; i++) {
            int j = i + k - 1;
            int minOfSubarray = Integer.MAX_VALUE;
            for (int l = i; l <= j; l++) {
                minOfSubarray = Math.min(minOfSubarray, arr[l]);
            }
            result = Math.max(result, minOfSubarray);
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        int k = 2;
        int maxOfMinSubarrays = maxOfMinSubarrays(arr, n, k);
        System.out.println("Maximum of minimum values of all subarrays of size " + k + ": " + maxOfMinSubarrays);
    }
}
