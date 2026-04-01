class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length - 1;
        int maxArea = 0;
        
        while (left < right) {
            // Calculate area based on the shorter side
            int minHeight = Math.min(heights[left], heights[right]);
            int width = right - left;
            int currentArea = minHeight * width;
            
            maxArea = Math.max(maxArea, currentArea);
            
            // Move the pointer pointing to the shorter line inward
            if (heights[left] < heights[right]) {
                left++;
            } else {
                right--;
            }
        }
        
        return maxArea;
    }
}
