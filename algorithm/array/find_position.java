package binarySearch;

// leetcode34 在排序数组中查找元素的第一个和最后一个位置
public class find_position {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};
        int low = lower_bound(nums,target);
        // low == nums.length处理的是nums为空以及所有数都小于target的情况
        if(low == nums.length || nums[low]!=target)return ans;
        int high = lower_bound(nums,target+1)-1;
        ans[0] = low;
        ans[1] = high;
        return ans;
    }

    public int lower_bound(int[] nums, int target)
    {
        int n = nums.length;
        int l = 0, r = n-1, mid = 0;
        while(l<=r)
        {
            mid = (l+r)/2;
            if(nums[mid]<target) l = mid+1;
            else r = mid-1;  //注意这里和正常二分的区别（>=被划为到了一起处理）
        }
        return l;
    }
}
