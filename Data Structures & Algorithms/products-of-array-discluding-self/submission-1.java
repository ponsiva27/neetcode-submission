class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int[] prefix = productPrefix(nums);

        int[] suffix = productSuffix(nums);

        int[] ans = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(i==0){
                ans[i]=suffix[i+1];
            } else if (i==nums.length-1){
                 ans[i]=prefix[i-1];
            }else{
            ans[i]=prefix[i-1]*suffix[i+1];
            }
        }
        return ans;
    }

        private int[] productPrefix(int[] nums){

             int[] arr1 = new int[nums.length];
             arr1[0]=nums[0];

             for(int i=1;i<nums.length;i++){
                 arr1[i] = arr1[i-1]*nums[i];
             }
             return arr1;
        }

        private int[] productSuffix(int[] nums){
            
            int[] arr2 = new int[nums.length];

            arr2[nums.length-1] = nums[nums.length-1];

            for(int i=nums.length-2;i>=0;i--){
                arr2[i] = nums[i]*arr2[i+1];
            }
            return arr2;
        }
    
}  
