
import java.util.HashSet;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class HashMapApproach {
    public static List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> result = new HashSet<>();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++) {
            Set<Integer> seen = new HashSet<>();
            for(int j = i + 1; j < nums.length - 1; j++) {
                int comp = - nums[i] - nums[j];
                if(seen.contains(comp)) {
                    result.add(Arrays.asList(nums[i], comp, nums[j]));
                }
                seen.add(nums[j]);
            }
        }
        return new ArrayList<>(result);
    }

    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, 4};
        System.err.println("Array : " + threeSum(nums));
    }
}