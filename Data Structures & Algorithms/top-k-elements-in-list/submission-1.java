class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
       Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // 2. Brute Force Sorting (O(N log N) - Better than O(N^2))
        // Convert the map entries into a List for sorting.
        List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(freqMap.entrySet());

        // Sort the list based on frequency (Value) in descending order.
        // This is the O(N log N) part.
        entryList.sort((a, b) -> b.getValue() - a.getValue());

        // 3. Extract the Top K elements
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            // Get the Key (the actual number) from the top K entries.
            result[i] = entryList.get(i).getKey();
        }

        return result;
    }
}
