class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++) {
            int freq =map.getOrDefault(nums[i],0);
            map.put(nums[i], freq+1);
        }
        // Inserted the map into an arrayList
        List<Map.Entry<Integer,Integer>> mapList = new ArrayList<>(map.entrySet());
        // Sorted the list in descending order of its frequency
        mapList.sort( (a,b) -> b.getValue()-a.getValue());
        
        int[] arr = new int[k];

        for(int i=0;i<k;i++){
          arr[i] = mapList.get(i).getKey();
        }

        return arr;

    }
}
