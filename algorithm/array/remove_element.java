public class remove_element {
    public int removeElement(int[] nums, int val) {
        int len = nums.length;
        int slow = 0;
        for(int fast = 0;fast<len;fast++)
        {
            if(nums[fast]!=val)
            {
                nums[slow] = nums[fast];
                slow++;
            }
        }
        return slow;
    }
}
