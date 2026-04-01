class Solution {
    public int longestConsecutive(int[] nums) {

      if (nums == null || nums.length == 0) {
        return 0;
    }

    // 1. Sort the array (O(N log N))
    java.util.Arrays.sort(nums); 
    
    int currentStreak = 1;
    int maxStreak = 1;

    // 2. Iterate through the sorted array (O(N))
    for (int i = 1; i < nums.length; i++) {
        
        // Skip duplicates to avoid double counting and incorrect resets
        if (nums[i] == nums[i-1]) {
            continue; 
        } 
        // Case 1: Consecutive element found
        else if (nums[i] == nums[i-1] + 1) {
            currentStreak++;
        } 
        // Case 3: Sequence is broken
        else {
            // Check if the old streak was the best one
            maxStreak = Math.max(maxStreak, currentStreak);
            // Reset the current streak for the new sequence
            currentStreak = 1; 
        }
    }
    
    // Final check for the last calculated streak
    maxStreak = Math.max(maxStreak, currentStreak);
    return maxStreak;
    }
}
