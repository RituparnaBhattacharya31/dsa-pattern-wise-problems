
import java.util.Arrays;

public class TwoPointerApproach {
    public static char[] reverseString(char[] str) {
        int left = 0;
        int right = str.length - 1;
        while(left < right) {
            char temp = str[left];
            str[left] = str[right];
            str[right] = temp;
            left++;
            right--;
        }
        return str;
    }

    public static void main(String[] args) {
        char[] str = new char[] {'h', 'e', 'l', 'l', 'o'};
        System.out.println("Revered string array : "+ Arrays.toString(reverseString(str)));
    }
}