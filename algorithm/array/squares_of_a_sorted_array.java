public class squares_of_a_sorted_array {
    class Solution {
        public int[] sortedSquares(int[] nums) {
            int[] ans = new int[nums.length];
            int k=nums.length-1;
            int left = 0,right=nums.length-1;
            while(left<=right)
            {
                if(Math.abs(nums[left])>=Math.abs(nums[right]))
                {
                    ans[k--]=nums[left]*nums[left];
                    left++;
                }
                else
                {
                    ans[k--]=nums[right]*nums[right];
                    right--;
                }
            }
            return ans;
        }
    }
}
