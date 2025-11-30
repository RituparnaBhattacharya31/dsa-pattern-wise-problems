public class BruteForceApproach {
    public static int[] twoSumSortedArray(int[] nums, int target) {
        for(int i = 0; i < nums.length - 1; i++) {
            for(int j = 1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target) {
                    return new int[] {i, j};
                }
            }
        }
        return new int[] {-1, -1};
    }

    public static void main(String[] args) {
        int[] arr = new int[]{0, 1, 2, 3, 4, 5, 6};
        System.out.println("Found indeces are : " + twoSumSortedArray(arr, 4));
    }
}