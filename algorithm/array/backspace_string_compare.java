public class backspace_string_compare {
    class Solution {
        public boolean backspaceCompare(String s, String t) {
            StringBuilder str1 = new StringBuilder();
            StringBuilder str2 = new StringBuilder();
            for(int i=0;i<s.length();i++)
            {
                if(s.charAt(i)=='#' && !str1.isEmpty()) str1.deleteCharAt(str1.length()-1);
                else if(s.charAt(i)!='#')str1.append(s.charAt(i));
            }
            for(int i=0;i<t.length();i++)
            {
                if(t.charAt(i)=='#' && !str2.isEmpty())str2.deleteCharAt(str2.length()-1);
                else if(t.charAt(i)!='#')str2.append(t.charAt(i));
            }
            return str1.toString().equals(str2.toString());
        }
    }
}
