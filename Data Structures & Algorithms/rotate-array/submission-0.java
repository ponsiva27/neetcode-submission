class Solution {
    public void rotate(int[] nums, int k) {

        k = k % nums.length;
        if (k == 0) return;

        // 2. Three-step reverse strategy
        reverse(nums, 0, nums.length - 1); // Reverse whole array
        reverse(nums, 0, k - 1);           // Reverse first k elements
        reverse(nums, k, nums.length - 1); // Reverse the rest

    }
    private void reverse(int[] nums, int start, int end){

        while(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}