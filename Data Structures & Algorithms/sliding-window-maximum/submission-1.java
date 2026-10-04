class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        
        Deque<Integer> maxQue = new ArrayDeque<>();

        int[] arr = new int [nums.length-k+1];
        int j=0;
        for(int i=0;i<nums.length;i++) {

            while(!maxQue.isEmpty() && maxQue.peekFirst()<=i-k) {
                maxQue.pollFirst();
            }

            while(!maxQue.isEmpty() && nums[maxQue.peekLast()]<=nums[i]) {
                   maxQue.pollLast();
            }

            maxQue.offerLast(i);
            
            if(i>=k-1) {
                arr[j] = nums[maxQue.peekFirst()];
                j++;
            }
        }
        return arr;
    }
}
