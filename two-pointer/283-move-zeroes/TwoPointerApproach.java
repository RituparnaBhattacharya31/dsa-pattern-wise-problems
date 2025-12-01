import java.util.Arrays;

public class TwoPointerApproach {
    public static int[] moveZeroes(int[] nums) {
        int j = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != 0) {
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                j++;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {3, 0, 6, 0, 4, 0, 5, 9, 0};
        System.out.println("Updated array is : " + Arrays.toString(moveZeroes(arr)));
    }
}