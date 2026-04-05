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


        if(intervals==null || intervals.isEmpty()) {
            return 0;
        }

        PriorityQueue<Integer> que = new PriorityQueue<>();

        Collections.sort(intervals, (a,b)-> {
             return Integer.compare(a.start,b.start);
        });

        que.add(intervals.get(0).end);

        for(int i=1;i<intervals.size();i++) {
             
             if(intervals.get(i).start < que.peek()) {
                    que.add(intervals.get(i).end);
             } else {
                que.poll();
                que.add(intervals.get(i).end);
             }
        }
        return que.size();
    }
}
