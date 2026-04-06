class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        
        if(intervals==null){
            return new int[][]{};
        }

        List<int[]>result = new ArrayList<>();
        int i=0;

        // Phase 1: Add all intervals coming BEFORE the new interval
        while(i<intervals.length && intervals[i][1] < newInterval[0]) {
            result.add(intervals[i]);
            i++;
        }

        // Phase 2: Merge all OVERLAPPING intervals
        // An interval overlaps if it starts before or when the newInterval ENDS
        while(i<intervals.length && intervals[i][0]<=newInterval[1]) {

         newInterval[0] = Math.min(intervals[i][0], newInterval[0]);
         newInterval[1] = Math.max(intervals[i][1], newInterval[1]);
         i++;
        }

        result.add(newInterval);

        // Phase 3: Add all remaining intervals
        while(i<intervals.length) {
            result.add(intervals[i]);
            i++;
        }
        return result.toArray(new int[result.size()][] );
    }
}
