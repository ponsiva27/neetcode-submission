class Solution {
    public int longestConsecutive(int[] nums) {
        
        if(nums==null || nums.length==0) return 0;

        Arrays.sort(nums);
        int max=1,count=1;
        for(int i=1;i<nums.length;i++) {
             int current = nums[i];
             int previous = nums[i-1];
            if(current==previous) {
                 continue;
            } else if(current==previous+1) {
                    count++;
            }  else {
                count=1;
            }
            max = Math.max(max,count);
        }
        return max;
    }
}
