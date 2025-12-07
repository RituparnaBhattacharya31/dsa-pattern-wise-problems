
import java.util.Arrays;

public class BruteForceApproach {

    public static int[] squaresOfSortedArray(int[] nums) {
        int[] prodOfArray = new int[nums.length];
        int j = 0;
        for (int num : nums) {
            prodOfArray[j] = num * num;
            j++;
        }
        Arrays.sort(prodOfArray);
        return prodOfArray;
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 3, 9};
        System.out.println("sorted product of nums array : " + Arrays.toString(squaresOfSortedArray(nums)));
    }
}
