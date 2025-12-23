
import java.util.Arrays;

public class TwoPointerApproach2 {

    public static int[] squaresOfSortedArray(int[] nums) {
        int n = nums.length;
        int left = 0;
        int right = n - 1;
        int index = n - 1;
        int[] prodOfArray = new int[n];
        while (left <= right) {
            if (Math.abs(nums[left]) > Math.abs(nums[right])) {
                prodOfArray[index] = nums[left] * nums[left];
                left++;
            } else {
                prodOfArray[index] = nums[right] * nums[right];
                right--;
            }
            index--;
        }
        return prodOfArray;
    }

    public static void main(String[] args) {
        int[] nums = {-8, 0, 1, 3, 9};
        System.out.println("sorted product of nums array : " + Arrays.toString(squaresOfSortedArray(nums)));
    }
}
