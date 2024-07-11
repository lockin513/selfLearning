import java.util.ArrayList;
import java.util.List;

public class find_all_anagrams_in_a_string {
    class Solution {
        public List<Integer> findAnagrams(String s, String p) {
            List<Integer> ans = new ArrayList<>();
            for(int i=0;i<=s.length()-p.length();i++)
            {
                String str = s.substring(i,i+p.length());
                if(isAnagram(str,p))ans.add(i);
            }
            return ans;
        }
        public boolean isAnagram(String s, String t) {
            if(s.length()!=t.length())return false;
            char[] rem = new char[27];
            for(int i=0;i<s.length();i++)rem[s.charAt(i)-'a']++;
            for(int i=0;i<t.length();i++)rem[t.charAt(i)-'a']--;
            for(int i=0;i<rem.length;i++)
                if(rem[i]!=0)return false;
            return true;
        }
    }
}
