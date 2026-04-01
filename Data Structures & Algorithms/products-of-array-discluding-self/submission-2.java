class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int product=1;
        int[] output = new int[nums.length];

        for(int i=0;i<nums.length;i++){
            output[i]=product;
            product=product*nums[i];
        }
        int suffix=1;
        for(int j=nums.length-1;j>=0;j--){
            output[j]=output[j]*suffix;
            suffix=suffix*nums[j];
        }
        return output;
    }
}  
