class Solution {
    public int trap(int[] height) {

        int left=0;
        int right=height.length-1; 
        int maxLeft = height[left];
        int maxRight = height[right];
        int totalWater=0;
       

        while(left < right) {

             if(maxLeft < maxRight) {

                   left++;
                   maxLeft = Math.max(maxLeft, height[left]);
                   totalWater+=maxLeft-height[left];
             } else {
                right--;
                maxRight = Math.max(maxRight, height[right]);
                totalWater+=maxRight-height[right];
             }
        }
        return totalWater;
    }
}
