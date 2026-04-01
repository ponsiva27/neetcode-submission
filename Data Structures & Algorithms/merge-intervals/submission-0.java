class Solution {
    public int[][] merge(int[][] intervals) {
        
        if(intervals==null || intervals.length==0) {
            return new int[][] {};
        }

        Arrays.sort(intervals, (a,b)-> {
            return Integer.compare(a[0],b[0]);
        });

        List<int[]> result = new ArrayList<>();

        int[] currentInterval = intervals[0];
        result.add(currentInterval);

        for(int i=1;i<intervals.length;i++){

            int[]nextInterval = intervals[i];

            if(nextInterval[0]<=currentInterval[1]) {
                currentInterval[1]=Math.max(nextInterval[1],currentInterval[1]);
            } else {
                currentInterval=nextInterval;
                result.add(currentInterval);
            }
        }
        return result.toArray(new int[result.size()][]);
    }
}
