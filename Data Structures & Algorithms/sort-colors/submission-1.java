class Solution {
    public void sortColors(int[] nums) {
        
        int left=0;
        int middle=0;
        int right=nums.length-1;

        while(middle<=right){
            if(nums[middle]==0){
                 int temp=nums[left];
                 nums[left]=nums[middle];
                 nums[middle]=temp;
                 middle++;
                 left++;
            } else if(nums[middle]==2){
                int temp = nums[right];
                nums[right]=nums[middle];
                nums[middle]=temp;
                right--;
            } else{
                middle++;
            }
        }
    }
}