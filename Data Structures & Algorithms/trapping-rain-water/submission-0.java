class Solution {
    public int trap(int[] height) {

        int totalWater=0;
        for(int i=0;i<height.length;i++) {

            int leftMax=0;
            int rightMax=0;

            //check the pointer towards left
            for(int j=0;j<i;j++){
                leftMax = Math.max(leftMax,height[j]);
            }

            //check the pointer towards right
            for(int j=i;j<height.length;j++){
                rightMax = Math.max(rightMax,height[j]);
            }
            int currentPuddle = Math.min(leftMax,rightMax)-height[i];

            if(currentPuddle>0){
                totalWater += currentPuddle;
            }
        }
        return totalWater;   
    }
}
