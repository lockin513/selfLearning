import java.util.Arrays;

public class assign_cookies {
    class Solution {
        public int findContentChildren(int[] g, int[] s) {
            Arrays.sort(g);
            Arrays.sort(s);
            int index = 0;
            int ans = 0;
            for(int i=0;i<s.length;i++)
                if(s[i]>=g[index])
                {
                    ans++;
                    index++;
                    if(index==g.length)break;
                }
            return ans;
        }
    }
}
