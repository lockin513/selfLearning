public class binary_search {
    public static void main(String[] args) {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int n = nums.length;
        int target = 9;
        int ans = search(nums, target);
        System.out.println(ans);
    }

    public static int search(int[] nums, int target) {
        int n = nums.length;
        int l = 0, r = n - 1;
        while (l <= r) {
            int p = (l + r) / 2;
            if (nums[p] < target) {
                l = p + 1;
            } else if (nums[p] > target) {
                r = p - 1;
            } else {
                return p;
            }
        }
        return -1;
    }
}
