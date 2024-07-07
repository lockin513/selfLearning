public class jump_game {
    class Solution {
        public boolean canJump(int[] nums) {
            int far = 0;
            for(int i=0;i<=far;i++)
                if(nums[i]+i>=nums.length-1)return true;
                else if(nums[i]+i>far)far=nums[i]+i;
            return false;
        }
    }
}
