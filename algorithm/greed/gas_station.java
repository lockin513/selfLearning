public class gas_station {
    class Solution {
        public int canCompleteCircuit(int[] gas, int[] cost) {
            int curSum = 0;
            int totalSum = 0;
            int begin = 0;
            for(int i=0;i<gas.length;i++)
            {
                curSum+=gas[i]-cost[i];
                totalSum+=gas[i]-cost[i];
                if(curSum<0)
                {
                    curSum=0;
                    begin = i+1;
                }
            }
            if(totalSum>=0)return begin;
            else return -1;
        }
    }
}
