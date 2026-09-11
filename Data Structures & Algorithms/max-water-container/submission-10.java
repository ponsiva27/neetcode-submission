class Solution {
    public int maxArea(int[] heights) {
        
        int p1=0;
        int p2=heights.length-1;
        int volume =0;
        while(p1<p2) {

            int width=p2-p1;
            int height = Math.min(heights[p1], heights[p2]);
            int area = width*height;
            volume = Math.max(volume,area);
            if(heights[p1]>heights[p2]) {
                 p2--;
            }else {
                p1++;
            }
        }
        return volume;
    }
}
