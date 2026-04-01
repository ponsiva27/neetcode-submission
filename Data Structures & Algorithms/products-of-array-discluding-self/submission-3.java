class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int product=1;
        int[] output = new int[nums.length];

        for(int i=0;i<nums.length;i++){
            output[i]=product;  //1   // 1  //2 //8
            product=product*nums[i];//1 //2  //8  //48
        }
        //output of the array will be 1,1,2,8 for the given 1,2,4,6
        int suffix=1;
        for(int j=nums.length-1;j>=0;j--){
            output[j]=output[j]*suffix; //8  16
            suffix=suffix*nums[j];      //8  
        }
        return output;
    }
}  
