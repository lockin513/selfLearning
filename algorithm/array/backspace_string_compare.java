public class backspace_string_compare {
    public boolean backspaceCompare(String s, String t) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='#' && sb.length()>0)
            {
                sb.deleteCharAt(sb.length()-1);
            }
            else if(s.charAt(i)!='#')
            {
                sb.append(s.charAt(i));
            }
        }
        String s1 = sb.toString();
        for(int i=0;i<t.length();i++)
        {
            if(t.charAt(i)=='#' && sb2.length()>0)
            {
                sb2.deleteCharAt(sb2.length()-1);
            }
            else if(t.charAt(i)!='#')
            {
                sb2.append(t.charAt(i));
            }
        }
        String s2 = sb2.toString();
        return s1.equals(s2);
    }
}
