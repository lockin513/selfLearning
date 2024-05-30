public class find_the_index_of_the_first_occurrence_in_a_string {
    public int strStr(String haystack, String needle) {
        if(needle.length()>haystack.length())return -1;
        int pos = 0;
        for(int i=0;i<haystack.length();i++)
        {
            pos = i;
            for(int j=0;j<needle.length() && i<haystack.length();j++)
            {
                if(haystack.charAt(i)==needle.charAt(j))i++;
                else break;
                if(j==needle.length()-1)return i-needle.length();
            }
            i = pos;
        }
        return -1;
    }
}
