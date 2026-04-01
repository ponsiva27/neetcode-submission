

class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        
        // 1. Load all elements into a Set (O(N))
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }

        int longestStreak = 0;

        // 2. Iterate through each unique number (O(N) total work)
        for (int num : numSet) {
            
            // 3. CRITICAL OPTIMIZATION: Check if 'num' is the start of a sequence (O(1))
            // A number is the start if its predecessor (num - 1) is NOT in the set.
            if (!numSet.contains(num - 1)) {
                
                // If it's a start, begin tracking the current streak
                int currentNum = num;
                int currentStreak = 1;

                // 4. Follow the sequence: Check for num + 1, num + 2, ... (O(1) checks)
                // This 'while' loop only executes O(N) times in total across ALL starting numbers
                while (numSet.contains(currentNum + 1)) {
                    currentNum++;
                    currentStreak++;
                }

                // Update the overall maximum
                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }
        
        return longestStreak;
    }
}