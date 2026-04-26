class Solution {
    public int splitArray(int[] nums, int k) {
        
        int left=0;
        int right=0;

        for(int i=0;i<nums.length;i++) {
            left=Math.max(left,nums[i]);
            right=right+nums[i];
        }
        int min =0;
        while(left<=right) {
            int mid = left+(right-left)/2;

            if(canSplit(nums, mid,k)) {
                 min=mid;
                 right=mid-1;
            } else {
                left=mid+1;
            }
        }
        return min;
    }
    private boolean canSplit(int[] nums,int bucket, int k) {

        int arr=1;
        int load=0;

        for(int i=0;i<nums.length;i++) {
            if(load+nums[i]<=bucket) {
                load+=nums[i];
            } else {
                load=nums[i];
                arr++;
            }
        }
        return arr<=k;
    }
}