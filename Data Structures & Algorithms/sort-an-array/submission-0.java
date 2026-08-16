class Solution {
    public int[] sortArray(int[] nums) {
        
        PriorityQueue<Integer> que = new PriorityQueue<>();  
        

        for(int val : nums) {
            que.add(val);
        }

        int[] arr = new int[nums.length];
        int j=0;
        while(!que.isEmpty()) {
            arr[j++] = que.poll();
        }
        return arr;
    }
}