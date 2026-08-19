class Solution {
    public int subarraySum(int[] nums, int k) {
        
        HashMap<Integer,Integer> map = new HashMap<>();
       // Base case: We've seen a balance of 0 exactly 1 time (before we started)
        map.put(0, 1);
        
        int count = 0;
        int runningBalance = 0;
        
        for (int i = 0; i < nums.length; i++) {
            
            // 1. Update our running balance with today's transaction
            runningBalance = runningBalance + nums[i];
            
            // 2. The Math: What past balance are we looking for?
            int target = runningBalance - k;
            
            // 3. If we've seen that past balance, add its frequency to our count
            if (map.containsKey(target)) {
                count = count + map.get(target);
            }
            
            // 4. Record today's running balance in the ledger for the future
            int frequency = map.getOrDefault(runningBalance, 0);
            map.put(runningBalance, frequency + 1);
        }
        return count;
    }
}