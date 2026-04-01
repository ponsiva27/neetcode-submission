class Solution {
    public int maxArea(int[] heights) {
        
        int max=0;
        int area=0;
        for(int i=0;i<heights.length;i++){

            for(int j=i+1;j<heights.length;j++){

              int width = j-i;
             area =width*Math.min(heights[i],heights[j]);
             max = Math.max(area,max); 
            }
        }
        return max;
    }
}
