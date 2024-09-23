public class find_first_and_last_position_of_element_in_sorted_array {
    class Solution {
        public int[] searchRange(int[] nums, int target) {
            int begin = findPos(nums,target);
            if(begin>=nums.length || nums[begin]!=target)return new int[]{-1,-1};
            int end = findPos(nums,target+1)-1;
            return new int[]{begin,end};
        }
        public int findPos(int[] nums,int target){
            int left=0,right=nums.length-1,mid=0;
            while(left<=right)
            {
                mid = (left+right)/2;
                if(nums[mid]>=target)right=mid-1;
                else left=mid+1;
            }
            return left;
        }
    }
}
