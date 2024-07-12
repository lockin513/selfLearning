public class ransom_note {
    class Solution {
        public boolean canConstruct(String ransomNote, String magazine) {
            int[] rem = new int[27];
            for(int i=0;i<magazine.length();i++)rem[magazine.charAt(i)-'a']++;
            for(int i=0;i<ransomNote.length();i++)
                if(rem[ransomNote.charAt(i)-'a']==0)return false;
                else rem[ransomNote.charAt(i)-'a']--;
            return true;
        }
    }
}
