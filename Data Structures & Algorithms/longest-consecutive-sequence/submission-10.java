class Solution {
    public int longestConsecutive(int[] nums) {

        if(nums==null || nums.length==0) {
            return 0;
        }        

        Arrays.sort(nums);
        int longestCount =1;
        int max=1;
        for(int i=0;i<nums.length-1;i++) {

            if(nums[i]!=nums[i+1]) {

                if(nums[i]+1==nums[i+1]) {
                longestCount++;
                }
             else {
                longestCount=1;
            }
            }
            max = Math.max(max, longestCount);
        }

        return max;
    }
}
