public class palindromic_substrings {
    class Solution {
        public int countSubstrings(String s) {
            boolean[][] dp = new boolean[s.length()][s.length()];
            int ans = 0;
            for(int i=s.length()-1;i>=0;i--)
            {
                for(int j=i;j<s.length();j++)
                {
                    if(s.charAt(i)==s.charAt(j))
                    {
                        if(j-i<=1)
                        {
                            ans++;
                            dp[i][j]=true;
                        }
                        else
                        {
                            if(dp[i+1][j-1]==true)
                            {
                                ans++;
                                dp[i][j]=true;
                            }
                        }
                    }
                }
            }
            return ans;
        }
    }
}
