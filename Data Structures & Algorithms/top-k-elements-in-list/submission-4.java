class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        //Edge case condition
        if(nums==null || nums.length==0) {
            return new int[]{};
        }
        //Collect and store the frequencies of each elements
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++) {    
            int freq = map.getOrDefault(nums[i],0);
            map.put(nums[i], freq+1);
        }

        //sort the element based on frequency using Priority Queue
        PriorityQueue<Integer> que = new PriorityQueue<>( 
            (a,b) -> map.get(a)-map.get(b)
        );

        // Filtering the elements which are less than Top K 
        for(int val : map.keySet()) {
            que.add(val);

            if(que.size()>k) {
                que.poll();
            }
        }

        //Collect the Top K elements
        int[] arr = new int[k];
        int j=0;
        while(!que.isEmpty()) {
            arr[j++]=que.poll();
        }
        return arr;
    }
}
