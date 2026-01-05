
import java.util.Arrays;
import java.util.HashMap;

public class HashMapApproach {

    public static int[] twoSumSortedArray(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (map.containsKey(diff)) {
                return new int[]{map.get(diff) + 1, i + 1};
            }
            map.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2, 7, 11, 15};
        System.out.println("Found indeces are : " + Arrays.toString(twoSumSortedArray(arr, 9)));
    }
}
