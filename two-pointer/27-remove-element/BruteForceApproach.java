


public class BruteForceApproach {

    public static int removeElement(int[] nums, int ele) {
        int[] updatedArray = new int[nums.length];
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != ele) {
                updatedArray[k] = nums[i];
                k++;
            }
        }
        int j = 0;
        int[] newArray = new int[k];
        while(j < k) {
            newArray[j] = updatedArray[j];
            j++;
        }
        return newArray.length;
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        int eleToRemove = 2;
        System.out.print("Updated array : " + removeElement(nums, eleToRemove));
    }
}
