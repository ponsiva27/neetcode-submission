class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        
        Deque<Integer> maxQue = new ArrayDeque<>();

        int[] arr = new int[nums.length-k+1];
        int j=0;
        for(int i=0;i<nums.length;i++) {
            
            // If the incoming element falls out of the window 'k'
            while(!maxQue.isEmpty() && maxQue.peekFirst()<=i-k) {
                  maxQue.pollFirst();      
            }
            // Remove the element which is no longer required
            while(!maxQue.isEmpty() && nums[maxQue.peekLast()]<=nums[i]) {
                 maxQue.pollLast();
            }

            maxQue.offerLast(i);

            if(i>=k-1) {
                 arr[j] =nums[maxQue.peekFirst()];        
                 j++;
            }
        }
        return arr;
    }
}
