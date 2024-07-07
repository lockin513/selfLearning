public class jump_game_ii {
    class Solution {
        public int jump(int[] nums) {
            if(nums.length==1)return 0;
            int far = 0;
            int step = 0;
            int tempMax = 0;
            for(int i=0;i<=far;i++)
            {
                for(int j=i;j<=far;j++)
                {
                    if(nums[j]+j>tempMax)
                    {
                        tempMax=nums[j]+j;
                        if(tempMax>=nums.length-1)return step+1;
                    }
                }
                step++;
                i=far;
                far=tempMax;
            }
            return step;
        }
    }
}
