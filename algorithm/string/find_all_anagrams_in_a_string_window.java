import java.util.ArrayList;
import java.util.List;

public class find_all_anagrams_in_a_string_window {
    class Solution {
        public List<Integer> findAnagrams(String s, String p) {
            List<Integer> ans = new ArrayList<>();
            if(s.length()<p.length())return ans;
            int[] rem = new int[27];
            for(int i=0;i<p.length();i++)
            {
                rem[p.charAt(i)-'a']++;
                rem[s.charAt(i)-'a']--;
            }
            if(isAllZero(rem))ans.add(0);
            int left=0,right=p.length();
            while(right<s.length())
            {
                rem[s.charAt(right)-'a']--;
                rem[s.charAt(left)-'a']++;
                right++;
                left++;
                if(isAllZero(rem))ans.add(left);
            }
            return ans;
        }
        public boolean isAllZero(int[] rem){
            for(int i:rem)
                if(i!=0)return false;
            return true;
        }
    }
}
