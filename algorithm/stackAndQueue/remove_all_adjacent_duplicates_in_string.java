public class remove_all_adjacent_duplicates_in_string {
    class Solution {
        public String removeDuplicates(String s) {
            char[] rem = s.toCharArray();
            int pos = -1;
            for(int i=0;i<s.length();i++)
                if(pos==-1 || rem[pos]!=rem[i])rem[++pos]=rem[i];
                else pos--;
            return String.valueOf(rem,0,pos+1);
        }
    }
}
