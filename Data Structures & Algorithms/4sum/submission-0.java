class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;
        
        // Step 1: Sort to use Two-Pointers and handle duplicates
        Arrays.sort(nums);

        for (int i = 0; i < n - 3; i++) {
            // Avoid duplicate for the first number
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            for (int j = i + 1; j < n - 2; j++) {
                // Avoid duplicate for the second number
                if (j > i + 1 && nums[j] == nums[j - 1]) continue;

                // Step 2: Now it's just a Two-Pointer "Two Sum" problem!
                int left = j + 1;
                int right = n - 1;

                while (left < right) {
                    // Use long to avoid integer overflow (important for large targets)
                    long sum = (long)nums[i] + nums[j] + nums[left] + nums[right];

                    if (sum == target) {
                        result.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                        
                        // Skip duplicates for the third number
                        while (left < right && nums[left] == nums[left + 1]) left++;
                        // Skip duplicates for the fourth number
                        while (left < right && nums[right] == nums[right - 1]) right--;
                        
                        left++;
                        right--;
                    } else if (sum < target) {
                        left++; // Need a bigger sum
                    } else {
                        right--; // Need a smaller sum
                    }
                }
            }
        }
        return result;
    }
}