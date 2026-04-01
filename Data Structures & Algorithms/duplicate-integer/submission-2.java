class Solution {
    public boolean hasDuplicate(int[] nums) {
        
        HashSet<Integer> seen = new HashSet<>();

         for(int element : nums){

             if(seen.contains(element)){
                  return true;
             }
             seen.add(element);
         }
         return false;
    }
}