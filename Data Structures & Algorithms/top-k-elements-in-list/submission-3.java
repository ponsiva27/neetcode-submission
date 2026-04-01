class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        HashMap<Integer,Integer> map = new HashMap<>();

        int[] arr = new int[k];
        for(int i=0;i<nums.length;i++){

            int freq = map.getOrDefault(nums[i],0);
            map.put(nums[i],freq+1);
        }

        PriorityQueue<Integer> que = new PriorityQueue<>( (a,b)-> map.get(a)-map.get(b));

        for(int num: map.keySet()) {

            que.add(num);

            if(que.size()>k) {
                que.poll();
            }
        }
        int i=0;
        while(!que.isEmpty()){
            arr[i++]=que.poll();
        }
        return arr;
    }
}
