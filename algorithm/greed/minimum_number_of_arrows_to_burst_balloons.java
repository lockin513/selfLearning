import java.util.Arrays;

public class minimum_number_of_arrows_to_burst_balloons {
    class Solution {
        public int findMinArrowShots(int[][] points) {
            Arrays.sort(points,(a, b)->Integer.compare(a[0],b[0]));
            int end = points[0][1];
            int arrow = 1;
            for(int i=1;i<points.length;i++)
            {
                if(points[i][0]<=end)
                {
                    if(points[i][1]<end)end=points[i][1];
                }
                else{
                    end = points[i][1];
                    arrow++;
                }
            }
            return arrow;
        }
    }
}
