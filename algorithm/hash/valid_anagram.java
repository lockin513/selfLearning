public class valid_anagram {
    class Solution {
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
