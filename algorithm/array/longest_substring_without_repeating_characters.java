public class longest_substring_without_repeating_characters {
    class Solution {
        public int lengthOfLongestSubstring(String s) {
            int[] rem = new int[255];
            int ans = 0,left=0,right=0;
            while(right<s.length())
            {
                rem[s.charAt(right)]++;
                if(rem[s.charAt(right)]<=1)
                {
                    int count=right-left+1;
                    if(count>ans)ans=count;
                }
                right++;
                while(!isOK(rem) && left<right)
                {
                    rem[s.charAt(left)]--;
                    left++;
                }
            }
            return ans;
        }
        public boolean isOK(int[] rem){
            for(int i:rem)
                if(i>1)return false;
            return true;
        }
    }
}
