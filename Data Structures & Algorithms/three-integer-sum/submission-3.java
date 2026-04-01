class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // 1. Sort the array so we can use Two Pointers and handle duplicates
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();

        // 2. The Outer Loop fixes the first pointer ('i')
        // We stop at nums.length - 2 because we need at least 3 numbers
        for (int i = 0; i < nums.length - 2; i++) {
            
            // Skip duplicate 'i' elements to avoid duplicate triplets
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int left = i + 1;
            int right = nums.length - 1;

            // 3. The Inner Engine: Two Pointers finding a target
            while (left < right) {
                // ADD VALUES, NOT INDICES
                int currentSum = nums[i] + nums[left] + nums[right];

                if (currentSum > 0) {
                    right--; // Sum is too big, decrease it
                } else if (currentSum < 0) {
                    left++;  // Sum is too small, increase it
                } else {
                    // We found a valid triplet!
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    
                    // Move both pointers inward
                    left++;
                    right--;

                    // Skip duplicate 'left' elements
                    // (We compare with left-1 because we already incremented left above)
                    while (left < right && nums[left] == nums[left - 1]) {
                        left++;
                    }
                }
            }
        }
        return result;
    }
}