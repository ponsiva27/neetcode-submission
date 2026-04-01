class Solution {
    public boolean hasDuplicate(int[] nums) {
        
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){

            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        for(int num:nums){
            
            if(map.containsKey(num)){
                int freq =map.get(num);
                if(freq>1){
                    return true;
                }
            }
        }
        return false;
    }
}