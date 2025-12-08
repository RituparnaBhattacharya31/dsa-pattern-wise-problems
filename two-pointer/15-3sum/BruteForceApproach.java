
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BruteForceApproach {
    public static List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> result = new HashSet<>();
        for(int i = 0; i < nums.length; i++) {
            for(int j = i+1; j < nums.length - 1; j++) {
                for(int k = j+1; k < nums.length - 2; k++) {
                    if(nums[i] + nums[j] + nums[k] == 0) {
                        int[] tripArr = {nums[i], nums[j], nums[k]};
                        Arrays.sort(tripArr);
                        result.add(Arrays.asList(tripArr[0], tripArr[1], tripArr[2]));
                    }
                }
            }
        }
        return new ArrayList<>(result);
    }
    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, 4};
        System.err.println("Array : " + threeSum(nums));
    }
}