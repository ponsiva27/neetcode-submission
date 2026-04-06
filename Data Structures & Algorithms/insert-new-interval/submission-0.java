class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        
        if(intervals==null){
            return new int[][]{};
        }

        List<int[]>result = new ArrayList<>();
        int i=0;

        while(i<intervals.length && intervals[i][1] < newInterval[0]) {
            result.add(intervals[i]);
            i++;
        }

        //Phase 2:
        while(i<intervals.length && intervals[i][0]<=newInterval[1]) {

         newInterval[0] = Math.min(intervals[i][0], newInterval[0]);
         newInterval[1] = Math.max(intervals[i][1], newInterval[1]);
         i++;
        }
        result.add(newInterval);

        while(i<intervals.length) {
            result.add(intervals[i]);
            i++;
        }
        return result.toArray(new int[result.size()][] );
    }
}
