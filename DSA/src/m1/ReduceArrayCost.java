package m1;

public class ReduceArrayCost {

    public static void main(String[] args) {
        int[] arr = {25, 10, 20};
        int result = minCostToReduceArray(arr);
        System.out.println("The minimum possible cost to reduce the array " + arrayToString(arr) + " is " + result + ".");
    }

    public static int minCostToReduceArray(int[] arr) {
        // Sort the array in ascending order
        java.util.Arrays.sort(arr);

        // Initialize the total cost
        int totalCost = 0;

        // While there are more than 1 elements in the array
        while (arr.length > 1) {
            // Pick the two smallest elements
            int a = arr[0];
            int b = arr[1];

            // Calculate the cost of the operation
            int cost = a + b;

            // Update the total cost
            totalCost += cost;

            // Create a new array with the sum of the two elements
            int[] newArr = new int[arr.length - 1];
            newArr[0] = a + b;

            // Copy the remaining elements from the original array
            System.arraycopy(arr, 2, newArr, 1, arr.length - 2);

            // Update the array reference
            arr = newArr;
        }

        return totalCost;
    }

    public static String arrayToString(int[] arr) {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            if (i < arr.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
