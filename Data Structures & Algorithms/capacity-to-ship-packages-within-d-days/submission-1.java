class Solution {
    public int shipWithinDays(int[] weights, int days) {
        
        int left=0;
        int right=0;

        for(int i=0;i<weights.length;i++) {
            left = Math.max(left,weights[i]);
            right = right+weights[i];
        }
        int maxWeight=0;
        while(left<=right) {
            int mid = left+(right-left)/2;

            if(canShip(weights, mid, days)) {
                maxWeight=mid;
                right=mid-1;
            }else {
                left=mid+1;
            }
        }
        return maxWeight;
    }
    private boolean canShip(int[] weights, int allowedWeight, int days) {

        int weight=0;
        int currentDay=1;
        for(int i=0;i<weights.length;i++) {
            if(weights[i]+weight<=allowedWeight) {
                 weight+=weights[i];
            } else {
                weight=weights[i];
                currentDay++;
            }
        }
        return currentDay<=days;
    }
}