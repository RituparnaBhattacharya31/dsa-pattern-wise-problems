
public class TwoPointerApproach {

    public static int longestMountainLenCount(int[] arr) {
        if (arr.length < 3) {
            return 0;
        }
        boolean peak = false;
        boolean valley = false;
        int longestLen = 0;
        int i = 0;
        while(i < arr.length - 1) {
            int start = 0;
            if(arr[i] < arr[i+1]) {
                while(i < arr.length - 1 && arr[i] < arr[i+1]) {
                    peak = true;
                    i++;
                }
                while(i < arr.length - 1 && arr[i] > arr[i+1]) {
                    valley = true;
                    i++;
                }
                if(peak == true && valley == true) {
                    longestLen += (i - start);
                }
                peak = false;
                valley = false;
            } else {
                i++;
            }
        }

        return longestLen;
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 4, 7, 3, 2, 5};
        System.out.println("Longest mountain range: " + longestMountainLenCount(arr));
    }
}
