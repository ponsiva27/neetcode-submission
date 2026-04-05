class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        
        if(intervals==null) {
            return 0;
        }

        Arrays.sort(intervals, (a,b)-> {
            return Integer.compare(a[0],b[0]);
        });

        int overlap =0;
        int currentEndTime = intervals[0][1];
        
        for(int i=1;i<intervals.length;i++) {
            int[] nextInterval = intervals[i];

             if(nextInterval[0]<currentEndTime){
                overlap++;
                currentEndTime = Math.min(currentEndTime,nextInterval[1]);
            } else {
                currentEndTime = nextInterval[1];
            }
        }
        return overlap;

    }
}
