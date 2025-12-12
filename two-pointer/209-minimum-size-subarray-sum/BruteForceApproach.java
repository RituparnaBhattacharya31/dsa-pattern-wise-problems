public class BruteForceApproach {
    public static int minimumSizeSubArraySum(int target, int[] arr) {
        int minLen = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int s = 0;
            for(int j = i; j < arr.length; j++) {
                s = s + arr[j];
                if(s >= target) {
                    minLen = Math.min(minLen, j - i + 1);
                    break; 
                }
            }
        }
        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }
    public static void main(String[] args) {
        int[] arr = {1, 4, 4, 1, 5};
        System.out.println("longest substring without repeating character : " + minimumSizeSubArraySum(5, arr));
    }
}