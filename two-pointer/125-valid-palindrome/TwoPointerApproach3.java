public class TwoPointerApproach3 {
    public static boolean isValidPalindrome(String string) {
        string = string.toLowerCase().replaceAll("[^a-z0-9]", "");
        int left = 0;
        int right = string.length() - 1;
        while(left < right) {
            if(string.charAt(left) != string.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "I am not you";
        System.out.print("is a valid palindrom : " + isValidPalindrome(str));
    }
}