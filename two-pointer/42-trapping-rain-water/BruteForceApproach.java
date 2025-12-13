public class BruteForceApproach {
    public static int tappingRainWater(int[] height) {
        int water = 0;
        for(int i = 0; i < height.length; i++) {
            int leftMax = 0, rightMax = 0;
            for(int l = i; l >= 0; l--) {
                leftMax = Math.max(leftMax, height[l]);
            }

            for(int r = i; r < height.length; r++) {
                rightMax = Math.max(rightMax, height[r]);
            }
            if(Math.min(leftMax, rightMax) - height[i] > 0) {
                water = water + Math.min(leftMax, rightMax) - height[i];
            }
        }
        return water;
    }

    public static void main(String[] args) {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println("Height of trapping water : " + tappingRainWater(height));
    }
}