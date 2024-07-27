public class permutation_in_string {
    class Solution {
        public boolean checkInclusion(String s1, String s2) {
            if(s1.length()>s2.length())return false;
            int[] rem = new int[27];
            for(int i=0;i<s1.length();i++)
            {
                rem[s1.charAt(i)-'a']++;
                rem[s2.charAt(i)-'a']--;
            }
            if(isAllZero(rem))return true;
            for(int i=s1.length();i<s2.length();i++)
            {
                rem[s2.charAt(i)-'a']--;
                rem[s2.charAt(i-s1.length())-'a']++;
                if(isAllZero(rem))return true;
            }
            return false;
        }
        public boolean isAllZero(int[] rem){
            for(int i:rem)
                if(i!=0)return false;
            return true;
        }
    }
}
