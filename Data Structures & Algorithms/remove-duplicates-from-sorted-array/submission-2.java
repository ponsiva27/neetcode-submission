class Solution {
    public int removeDuplicates(int[] nums) {
        
        int write=0;
        int read=1;
       
        while(read<nums.length) {

            if(nums[read]!=nums[write]){
                  write++;
                nums[write]=nums[read];      
            } else {
                read++; 
            }
        }
        return write+1;
    }
}