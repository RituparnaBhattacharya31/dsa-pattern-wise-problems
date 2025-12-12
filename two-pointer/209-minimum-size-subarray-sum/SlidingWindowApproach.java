public class SlidingWindowApproach {
    public static int minimumSizeSubArraySum(int target, int[] arr) {
        int left = 0;
        // int right = arr.length - 1;
        int minLen = Integer.MAX_VALUE;
        int s = 0;
        for(int right = 0; right < arr.length; right++) {
            s = s + arr[right];
            while(s >= target) {
                minLen = Math.min(minLen, right - left + 1);
                s = s - arr[left];
                left++;
            }
        }
        return minLen == Integer.MAX_VALUE ? 0 : minLen; 
    }
    public static void main(String[] args) {
        int[] arr = {1, 4, 4, 1, 5};
        System.out.println("longest substring without repeating character : " + minimumSizeSubArraySum(5, arr));
    }
}