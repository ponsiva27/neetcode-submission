class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        
        int minLen = Integer.MAX_VALUE;
        int left=0;
        int sum=0;
        for(int i=0;i<nums.length;i++) {

             sum=sum+nums[i];

            while(sum>=target){
                minLen=Math.min(minLen, i-left+1);
                sum=sum-nums[left];
                left++;
            }
        }
        return minLen==Integer.MAX_VALUE? 0 : minLen;
    }
}