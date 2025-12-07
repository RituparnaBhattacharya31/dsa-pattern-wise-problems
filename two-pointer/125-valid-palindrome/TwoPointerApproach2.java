public class TwoPointerApproach2 {
    public static boolean  isValidPalindrome(String string) {
        StringBuilder newString = new StringBuilder();
        for(char c : string.toCharArray()) {
            if(Character.isAlphabetic(c)) {
                newString.append(c);
            }
        }
        String string1 = newString.toString();
        String reverseredString1 = newString.reverse().toString();
        return string1.equalsIgnoreCase(reverseredString1);
    }

    public static void main(String[] args) {
        String str = "I am : ma, I";
        System.out.println("Is valid palindrom : " + isValidPalindrome(str));
    }
}