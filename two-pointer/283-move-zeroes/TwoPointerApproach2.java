
import java.util.Arrays;

public class TwoPointerApproach2 {

    public static int[] moveZeroes(int[] nums) {
        if(nums == null || nums.length <= 1) return nums;
        int lastNonZero = 0;
        int i = 0;
        while (i < nums.length) {
            if (nums[i] != 0) {
                nums[lastNonZero] = nums[i];
                if (i != lastNonZero) {
                    nums[i] = 0;
                }
                lastNonZero++;
            }
            i++;
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{3, 0, 6, 0, 4, 0, 5, 9, 0};
        System.out.println("Updated array is : " + Arrays.toString(moveZeroes(arr)));
    }
}
