
import java.util.HashMap;
import java.util.Map;

public class SlidingWindowHashMapApproach {
    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int left = 0;
        int maxLen = 0;
        Map<Character, Integer> seen = new HashMap<>();
        for(int right = 0; right < n; right++) {
            char c = s.charAt(right);
            if(seen.containsKey(c)) {
                left = Math.max(left, seen.get(c)+1);
            }
            seen.put(c, right);
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }
    public static void main(String[] args) {
        String s = "abcdeddcad";
        System.out.println("longest substring without repeating character : " + lengthOfLongestSubstring(s));
    }
}