/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public boolean canAttendMeetings(List<Interval> intervals) {

        if(intervals==null || intervals.isEmpty()){
            return true;
        }

        Collections.sort(intervals, (a,b)-> {

             return Integer.compare(a.start, b.start);
        });

        for(int i=0;i<intervals.size()-1;i++) {

          Interval currentInterval = intervals.get(i);
          Interval nextInterval = intervals.get(i+1);

           if(nextInterval.start< currentInterval.end) {
               return false;
           }
        }
        return true;
    }
}
