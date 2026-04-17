class Solution {
    public int searchInsert(int[] nums, int target) {
        
        //upper bound problem strictly greater than target

        int left=0;
        int right=nums.length-1;
        int idx=nums.length;

        while(left<=right) {

            int mid = left+(right-left)/2;

            if(nums[mid]==target) {
                return idx= mid; 
            } else  if (nums[mid]>target) {
                idx=mid;
                right = mid-1;
            } else {
                left = mid+1;
            }
        }
        return idx;
    }
}