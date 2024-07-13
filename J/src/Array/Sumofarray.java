package Array;
import java.util.ArrayList;
import java.util.List;

public class Sumofarray {

    public static List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums, target, new ArrayList<>(), result, 0);
        return result;
    }

    private static void backtrack(int[] nums, int remainingSum, List<Integer> currentCombination,
        List<List<Integer>> result, int startIndex) {
        if (remainingSum == 0) {
            result.add(new ArrayList<>(currentCombination));
        } else if (remainingSum < 0) {
            return;
        } else {
            for (int i = startIndex; i < nums.length; i++) {
                currentCombination.add(nums[i]);
                backtrack(nums, remainingSum - nums[i], currentCombination, result, i);
                currentCombination.remove(currentCombination.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        int num = 160;
        int[] x = {30, 100, 200};
        
        List<List<Integer>> combinations = combinationSum(x, num);

        for (List<Integer> combination : combinations) {
            System.out.println(combination);
        }
    }

    
}
