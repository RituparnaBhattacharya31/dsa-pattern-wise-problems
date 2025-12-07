public class TwoPointerApproach {
    public static boolean isValidPalindrome(String string) {
        int left = 0;
        int right = string.length() - 1;
        while(left < right) {
            while(left < right && !isAlphaNumeric(string.charAt(left))) {
                left++;
            }
            while(left < right && !isAlphaNumeric(string.charAt(right))) {
                right--;
            }
            char charLeft = string.charAt(left);
            char charRight = string.charAt(right);
            if(charLeft != charRight) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static boolean isAlphaNumeric(char c) {
        return Character.isAlphabetic(c);
    }
    public static void main(String[] args) {
        String str = "I am not you";
        System.out.println("Is valid palindrom : " + isValidPalindrome(str));
    }
}