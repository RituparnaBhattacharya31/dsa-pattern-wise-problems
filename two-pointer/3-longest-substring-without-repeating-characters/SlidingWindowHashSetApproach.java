
import java.util.HashSet;

public class SlidingWindowHashSetApproach {
    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int left = 0, right = 0;
        int maxLen = 0;
        HashSet<Character> seen = new HashSet<>();
        while(right < n) {
            char c = s.charAt(right);
            if(seen.contains(c)) {
                left++;
            }
            seen.add(c);
            maxLen = Math.max(maxLen, right - left + 1);
            right++;
        }
        return maxLen;
    }
    public static void main(String[] args) {
        String s = "abcdeddcad";
        System.out.println("longest substring without repeating character : " + lengthOfLongestSubstring(s));
    }
}