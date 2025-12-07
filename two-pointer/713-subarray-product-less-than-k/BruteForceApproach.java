public class BruteForceApproach {
    public static int subArrayProductLessThanK(int[] nums, int target) {
        int count = 0;
        for(int i = 0; i < nums.length; i++) {
            int product = 1;
            for(int j = i; j < nums.length; j++) {
                product = product * nums[j];
                if(product < target) {
                    count++;
                } else {
                    break;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] nums = {2, 7 ,4, 67, 9, 3, 6};
        int target = 100;
        System.err.println("Product of sub array : " + subArrayProductLessThanK(nums, target));
    }
}