public class BruteForceApproach {
    public static int containerWithMostWater(int[] heights) {
        int maxArea = 0;
        for(int i = 0; i < heights.length; i++) {
            for(int j = i+1; j < heights.length; j++) {
                int area = Math.min(heights[i], heights[j]) * (j-i);
                maxArea = Math.max(maxArea, area);
            }
        }
        return maxArea;
    }

    public static void main(String[] args) {
        int[] heights = {1,8,6,2,5,4,8,3,7};
        System.out.println("Max area is: "+ containerWithMostWater(heights));
    }

}