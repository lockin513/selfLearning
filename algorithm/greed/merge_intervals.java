import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class merge_intervals {
    class Solution {
        public int[][] merge(int[][] intervals) {
            Arrays.sort(intervals,(a, b)->Integer.compare(a[0],b[0]));
            List<int[]> ans = new LinkedList<>();
            int begin = intervals[0][0];
            int end = intervals[0][1];
            for(int i=1;i<intervals.length;i++)
            {
                if(intervals[i][0]>end)
                {
                    ans.add(new int[]{begin,end});
                    begin = intervals[i][0];
                    end = intervals[i][1];
                }
                else end = Math.max(intervals[i][1],end);
            }
            ans.add(new int[]{begin,end}); // 把最后一个加上去
            return ans.toArray(new int[ans.size()][]);
        }
    }
}
