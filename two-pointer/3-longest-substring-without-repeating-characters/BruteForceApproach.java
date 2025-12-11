public class BruteForceApproach {
    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLen = 0;
        for (int i = 0; i < n; i++) {
           for(int j = i; j < n; j++) {
                if(isUnique(s, i, j)) {
                    maxLen = Math.max(maxLen, j - i + 1);
                }
           }
        }
        return maxLen;
    }

    public static boolean isUnique(String s, int start, int end) {
        boolean[] freq = new boolean[128];
        for(int i = start; i <= end; i++) {
            char c = s.charAt(i);
            if(freq[c]) return false;
            freq[c] = true;
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "abcdeddcad";
        System.out.println("longest substring without repeating character : " + lengthOfLongestSubstring(s));
    }
}