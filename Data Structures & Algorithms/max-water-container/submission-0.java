class Solution {
    public int maxArea(int[] heights) {
        
      int area =0;
        for(int i=0;i<heights.length-1;i++){
           for(int j=i+1;j<heights.length;j++){
                int height = Math.min(heights[i], heights[j]);
                int width = j-i;
                area = Math.max(height*width, area);
           }
        }
        return area;
    }
}
