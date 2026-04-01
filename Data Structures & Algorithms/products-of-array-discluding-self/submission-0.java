class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int[] product = new int[nums.length];
        
        for(int i=0;i<nums.length;i++){
            long currentProduct =1;
            for(int j=0;j<nums.length;j++){
               if(i!=j){
                currentProduct = currentProduct*nums[j];
               }
            }
            product[i]=(int)currentProduct;
        }
        return product;
    }
}  
