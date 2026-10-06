class Solution {
    public int longestConsecutive(int[] nums) {
        
        if(nums==null || nums.length==0) {
            return 0;
        }

        HashSet<Integer> set = new HashSet<>();

        for(int num : nums) {
            set.add(num);
        }
        int longestCount=1;
        int max=1;

        for(int i=0;i<nums.length;i++) {
            
            int current = nums[i];

            if(!set.contains(current-1)) {

                 while(set.contains(current+1)) {
                      current++;
                      longestCount++;
                 }
                max = Math.max(max,longestCount);
                longestCount=1;
            }
            
        }
        return  max;
    }
}
