import java.util.ArrayList;
import java.util.List;

public class partition_labels {
    class Solution {
        public List<Integer> partitionLabels(String s) {
            List<Integer> ans = new ArrayList<>();
            int[] rem = new int[27];
            for(int i=0;i<s.length();i++)rem[s.charAt(i)-'a']=i;
            int left = 0;
            int right = 0;
            for(int i=0;i<s.length();i++)
            {
                if(rem[s.charAt(i)-'a']>right) right=rem[s.charAt(i)-'a'];
                if(i==right)
                {
                    ans.add(right-left+1);
                    left = i+1;
                }
            }
            return ans;
        }
    }
}
