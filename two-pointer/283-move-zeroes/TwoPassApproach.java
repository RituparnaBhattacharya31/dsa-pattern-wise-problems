import java.util.Arrays;

public class TwoPassApproach {
    public static int[] moveZeroes(int[] nums) {
        int index = 0;
        for(int n : nums) {
            if(n != 0) {
                nums[index] = n;
                index++;
            }
        }

        while(index < nums.length) {
            nums[index] = 0;
            index++;
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {3, 0, 6, 0, 4, 0, 5, 9, 0 };
        System.out.println("Updated array is : " + Arrays.toString(moveZeroes(arr)));
    }
}