class Solution {
    public boolean hasDuplicate(int[] nums) {
        
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int count= map.getOrDefault(nums[i],0);
           map.put(nums[i], count+1);
        }

        //check the frequency and find the duplicate
        for(int freq :map.values()){
            if(freq>1){
                return true;
            }
        }
        return false;
    }
}