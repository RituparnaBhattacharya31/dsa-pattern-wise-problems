public class TwoPointerApproach {
    public static int[] twoSumSortedArray(int[] nums, int target) {
        int j = 0;
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] + nums[j] == target) {
                return new int[] {j+1, i+1};
            }
            j++;
        }
        return new int[] {-1, -1};
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2,7,11,15};
        System.out.println("Found indeces are : " + twoSumSortedArray(arr, 18));
    }
}