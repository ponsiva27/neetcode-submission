class Solution {
    public int longestConsecutive(int[] nums) {
        
        if(nums==null || nums.length==0){
            return 0;
        }

        HashSet<Integer> set = new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        int max=1;
        int count=1;
        for(int num: set){
                  
             if(!set.contains(num-1)){ //if set doesn't contains the previous element then it could be the starting point
                    int currentElement=num;
                     count=1;
                   while(set.contains(currentElement+1)){
                       currentElement++;
                       count++;
                   }
                 
                   max=Math.max(max,count);
             }
        }
        return max;
    }
}
