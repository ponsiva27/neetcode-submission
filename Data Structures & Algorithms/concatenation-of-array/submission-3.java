class Solution {
    public int[] getConcatenation(int[] nums) {
        
        if(nums==null || nums.length==0) {
            return new int[]{};
        }

        int[] arr = new int[2*nums.length];

        for(int i=0; i<nums.length;i++) {
            arr[i]= nums[i];
            arr[i+nums.length]=nums[i];
        }
        return arr;
    }
}