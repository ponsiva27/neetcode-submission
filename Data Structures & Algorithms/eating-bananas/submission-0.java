class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        
        int left=1;
        int right=0;
        int ans=0;
        for(int i=0;i<piles.length;i++) {
            right=Math.max(piles[i],right);
        }

        while(left<=right) {
            int mid=left+(right-left)/2;

            if(canEat(piles,mid,h)) {
                ans=mid;
                right=mid-1;
            } else {
                left=mid+1;
            }
        }
        return ans;
    }
    private boolean canEat(int[] piles, int mid, int h) {

        int totalTime=0;

        for(int i=0;i<piles.length;i++) {
            totalTime=totalTime+(int) Math.ceil( (double)piles[i]/mid);
        }
        return totalTime<=h;
    }
}
