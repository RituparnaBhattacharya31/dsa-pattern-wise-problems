import java.util.Arrays;

public class TwoPointerApproach {

    public static int[] twoSumSortedArray(int[] nums, int target) {
        if (nums == null || nums.length <= 1) {
            return new int[]{-1, -1};
        }
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum == target) {
                return new int[]{left + 1, right + 1};
            } else if (sum > target) {
                right--;
            } else if (sum < target) {
                left++;
            }
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2, 7, 11, 15};
        System.out.println("Found indeces are : " + Arrays.toString(twoSumSortedArray(arr, 18)));
    }
}
