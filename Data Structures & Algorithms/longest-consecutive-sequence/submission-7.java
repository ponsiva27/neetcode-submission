class Solution {
    public int longestConsecutive(int[] nums) {
        
        HashSet<Integer> set = new HashSet<>();

        for(int num : nums) {
            set.add(num);
        }
        int count=1;
        int max=0;
        for(int i=0;i<nums.length;i++) {
             int current = nums[i];
             if(!set.contains(current-1)) {
                while(set.contains(current+1)) {
                    count++;
                    current++;
                }
                max = Math.max(max,count);
                count=1;
             }
        }
        return max;
    }
}
