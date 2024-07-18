import java.util.List;

public class word_break {
    class Solution {
        public boolean wordBreak(String s, List<String> wordDict) {
            boolean[] dp = new boolean[s.length()+1];
            dp[0]=true;
            for(int j=0;j<=s.length();j++)
            {
                for(int i=0;i<wordDict.size();i++)
                {
                    int len = wordDict.get(i).length();
                    if(j>=len && dp[j-len]==true && compare(s.substring(j-len,j),wordDict.get(i)))
                    {
                        dp[j]=true;
                    }
                }
            }
            return dp[s.length()];
        }
        public boolean compare(String s1,String s2){
            for(int i=0;i<s1.length();i++)
                if(s1.charAt(i)!=s2.charAt(i))return false;
            return true;
        }
    }
}
