
import java.util.HashSet;
import java.util.Set;

public class HashSetApproach {
    public static int removeDuplicates(int[] nums) {
        Set<Integer> unique = new HashSet<>();
        for(int num : nums) {
            unique.add(num);
        }

        int i = 0;
        for(int uniqueNum : unique) {
            nums[i] = uniqueNum;
            i++;
        }
        return unique.size();
    }

    public static void main(String[] args) {
        int[] arr = new int[]{0, 1, 1, 2, 2, 2, 3, 3, 3, 3, 4};
        System.out.println("Updated length of the array is : "+ removeDuplicates(arr));
    }
}