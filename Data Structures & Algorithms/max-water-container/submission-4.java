class Solution {
    public int maxArea(int[] heights) {
        

        int area=0,max=0;
        int i=0;
        int j=heights.length-1;
        while(i<j){

            int width = j-i;
            int height = Math.min(heights[i],heights[j]);
            area = Math.max(area, width*height);
            if(heights[i]<heights[j]){
                 i++;
            } else {
                j--;
            }
        }
        return area;
    }
}
