import java.util.ArrayList;
import java.util.List;

public class intersection_of_two_arrays {
    class Solution {
        public int[] intersection(int[] nums1, int[] nums2) {
            int[] rem = new int[1001];
            List<Integer> ans = new ArrayList<>();
            for(int i=0;i<nums1.length;i++)rem[nums1[i]]=1;
            for(int i=0;i<nums2.length;i++)
            {
                if(rem[nums2[i]]==0)continue;
                else
                {
                    rem[nums2[i]]=0;
                    ans.add(nums2[i]);
                }
            }
            int[] result = new int[ans.size()];
            for(int i=0;i<ans.size();i++)result[i]=ans.get(i);
            return result;
        }
    }
}
