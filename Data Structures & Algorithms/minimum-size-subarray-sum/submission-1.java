class Solution {
    public int minSubArrayLen(int target, int[] nums) {

        int minLen = Integer.MAX_VALUE;
    boolean found = false;

    for (int i = 0; i < nums.length; i++) {
        int sum = 0;
        for (int j = i; j < nums.length; j++) {
            sum += nums[j];
            if (sum >= target) {
                minLen = Math.min(minLen, j - i + 1);
                found = true;
                break; // Optimization: shortest subarray starting at 'i' found
            }
        }
    }
    return found ? minLen : 0;
    }
}