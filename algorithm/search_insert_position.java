//leetcode35 搜索插入位置
public class search_insert_position {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int l = 0, r = n-1;
        int p = 0;
        while(l<=r)
        {
            p = (l+r)/2;
            if(target>nums[p])
            {
                l = p+1;
            }
            else if(target<nums[p])
            {
                r = p-1;
            }
            else return p;
        }
        return l;
    }
}
