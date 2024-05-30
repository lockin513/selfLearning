public class repeated_substring_pattern {
    public boolean repeatedSubstringPattern(String s) {
        int len = s.length();
        for(int i=1;i<=len/2;i++)
        {
            if(len%i!=0)continue;
            boolean flag = true;
            for(int j=0;j<len;j++)
            {
                if(s.charAt(j)!=s.charAt(j%i))
                {
                    flag = false;
                    break;
                }
            }
            if(flag)return true;
        }
        return false;
    }
}
