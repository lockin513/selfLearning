public class fibonacci_number {
    class Solution {
        public int fib(int n) {
            if(n==0)return 0;
            if(n==1)return 1;
            int[] nums = new int[31];
            nums[0]=0;
            nums[1]=1;
            for(int i=2;i<=30;i++)
            {
                nums[i] = nums[i-1]+nums[i-2];
                if(i==n)return nums[i];
            }
            return -1;
        }
    }
}
