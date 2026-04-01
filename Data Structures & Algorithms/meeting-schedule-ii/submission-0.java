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
    public int minMeetingRooms(List<Interval> intervals) {

        if(intervals==null || intervals.isEmpty()){
             return 0;
        }

        Collections.sort(intervals, (a,b) -> 
            {
                return Integer.compare(a.start,b.start);
            }
        );

        PriorityQueue<Integer> que = new PriorityQueue<>();
        que.add(intervals.get(0).end);

        for(int i=1;i<intervals.size();i++) {

            Interval nextMeeting = intervals.get(i);
            if(nextMeeting.start>=que.peek()) {
                 que.poll();
            }
            que.add(nextMeeting.end);
        }
        return que.size();
    }
}
