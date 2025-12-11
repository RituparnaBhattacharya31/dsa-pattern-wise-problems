
import java.util.HashSet;
import java.util.Set;

public class HashSetApproach {
    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLen = 0;
        for(int i = 0; i < n; i++) {
            Set<Character> seen = new HashSet<>();
            for(int j = i; j < n; j++) {
                char c = s.charAt(j);
                if(seen.contains(c)) {
                    break;
                }
                seen.add(c);
                maxLen = Math.max(maxLen, j - i + 1);
            }
        }
        return maxLen;
    }
    public static void main(String[] args) {
        String s = "abcdeddcad";
        System.out.println("longest substring without repeating character : " + lengthOfLongestSubstring(s));
    }
}