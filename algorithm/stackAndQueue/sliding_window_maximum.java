import java.util.Deque;
import java.util.LinkedList;

public class sliding_window_maximum {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> deque = new LinkedList<Integer>();
        int rem = 0;
        int[] ans = new int[nums.length-k+1];
        for(int i=0;i<nums.length;i++)
        {
            while(!deque.isEmpty() && nums[i]>=nums[deque.peekLast()])
                deque.pollLast();
            deque.offerLast(i);
            while(deque.peekFirst() <= i-k) deque.pollFirst();
            if(i>=k-1) ans[rem++]=nums[deque.peekFirst()];
        }
        return ans;
    }
}
