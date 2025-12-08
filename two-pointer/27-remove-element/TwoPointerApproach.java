
public class TwoPointerApproach {

    public static int removeElement(int[] nums, int eleToRemove) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != eleToRemove) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        int eleToRemove = 2;
        System.out.print("Updated array : " + removeElement(nums, eleToRemove));
    }
}
