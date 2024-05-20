public class remove_duplicates_from_sorted_array {
    public int removeDuplicates(int[] nums) {
        int len = nums.length;
        int slow = 0;
        for(int fast = 1;fast<len;fast++)
        {
            if(nums[fast]!=nums[slow])
            {
                slow++;
                nums[slow] = nums[fast];
            }
        }
        return slow+1;
    }
}
