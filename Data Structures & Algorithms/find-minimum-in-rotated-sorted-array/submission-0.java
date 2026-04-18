class Solution {
    public int findMin(int[] nums) {
        

        int left=0;
        int right=nums.length-1;
        int minimum = Integer.MAX_VALUE;
        
        while(left<=right) {

            if(nums[left]<=nums[right]) {  // This TELLS the array is perfectly sorted
               minimum = Math.min(minimum, nums[left]);
               break;   
            }

            int mid= left+(right-left)/2;

            if(nums[left]<=nums[mid]) {   //means that left shelf is perfectly sorted
                minimum = Math.min(minimum, nums[left]);
                left=mid+1;
            } else {
                minimum = Math.min(minimum, nums[mid]);
                right=mid-1;
            }
        }
        return minimum;
    }
}
