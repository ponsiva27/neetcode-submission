class Solution {
    public int shipWithinDays(int[] weights, int days) {
        
        int left =0;
        int right=0;

        if(weights==null || weights.length==0) {
            return 0;
        }

        for(int num : weights) {
            left = Math.max(num,left);
            right = right+num;
        }
        
        int minimumDays =1;

        while(left<=right) {

            int mid = left+(right-left)/2;

             if(canShip(weights, mid, days)) {
                 minimumDays = mid;
                 right = mid-1;
            } else {
                left = mid+1;
            }
        }
        return minimumDays;
    }
    private boolean canShip(int[] weights, int capacity, int days) {

        int currentDay =1;
        int currentLoad=0;
        for(int i=0;i<weights.length;i++) {

             if((weights[i]+currentLoad)<=capacity) {
                  currentLoad = currentLoad+weights[i];   
             } else {
                currentLoad = weights[i];
                currentDay++;
             }
        }   
        return currentDay<=days;
    }
}