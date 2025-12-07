
import java.util.Arrays;

public class TwoPointerApproach {
    public static int[] squaresOfSortedArray(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int index = nums.length - 1;
        int[] prodOfArray = new int[nums.length];
        while(left <= right) {
            int leftProd = nums[left] * nums[left];
            int rightProd = nums[right] * nums[right];
            if(leftProd > rightProd) {
                prodOfArray[index] = leftProd;
                left++;
            } else {
                prodOfArray[index] = rightProd;
                right--;
            }
            index--;
        }
        return prodOfArray;
    }

    public static void main(String[] args) {
        int[] nums = {-99, -7, 1, 4, 5};
        System.err.println("Sorted squares of array : " + Arrays.toString(squaresOfSortedArray(nums))); 
    }
}