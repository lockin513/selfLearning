public class climbing_stairs {
    class Solution {
        public int climbStairs(int n) {
            if(n==1)return 1;
            if(n==2)return 2;
            int[] nums = new int[46];
            nums[1]=1;
            nums[2]=2;
            for(int i=3;i<=45;i++)
            {
                nums[i] = nums[i-1] + nums[i-2];
                if(i==n)return nums[i];
            }
            return -1;
        }
    }
}
