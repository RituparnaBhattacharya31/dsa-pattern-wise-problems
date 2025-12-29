
import java.util.ArrayList;
import java.util.List;

public class BruteForceApproach {

    public static int removeDuplicates(int[] nums) {
        List<Integer> unique = new ArrayList<>();
        for (int num : nums) {
            if (!unique.contains(num)) {
                unique.add(num);
            }
        }
        for (int i = 0; i < unique.size(); i++) {
            nums[i] = unique.get(i);
        }
        return unique.size();
    }

    public static void main(String[] args) {
        int[] arr = new int[]{0, 1, 1, 2, 2, 2, 3, 3, 3, 3, 4};
        System.out.println("Updated length of the array is : " + removeDuplicates(arr));
    }
}
