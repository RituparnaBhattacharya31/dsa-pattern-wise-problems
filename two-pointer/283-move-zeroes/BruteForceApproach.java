
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BruteForceApproach {

    public static int[] moveZeroes(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int n : nums) {
            if (n != 0) {
                list.add(n);
            }
        }

        int i = 0;
        for (int n : list) {
            nums[i] = n;
            i++;
        }
        while(i < nums.length) {
            nums[i] = 0;
            i++;
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {3, 0, 8, 9, 0, 6, 2, 0, 5, 0};
        System.out.println("Updated array is : " + Arrays.toString(moveZeroes(arr)));
    }
}
