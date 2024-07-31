import java.util.Deque;
import java.util.LinkedList;


public class sliding_window_maximum {
    class Solution {
        public int[] maxSlidingWindow(int[] nums, int k) {
            Deque<Integer> q = new LinkedList<>();
            int[] ans = new int[nums.length-k+1];
            int pos = 0;
            for(int i=0;i<nums.length;i++)
            {
                if(!q.isEmpty() && i>=k && nums[i-k]==q.peekFirst())q.pollFirst();
                while(!q.isEmpty() && nums[i]>q.peekLast())q.pollLast();
                q.offerLast(nums[i]);
                if(i>=k-1)ans[pos++]=q.peekFirst();
            }
            return ans;
        }
    }
}
