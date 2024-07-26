public class minimum_window_substring {
    class Solution {
        public String minWindow(String s, String t) {
            if(s.length()<t.length())return "";
            if(s.equals(t))return t;
            int count=t.length(),left=0,right=0,start=-1,size=s.length();
            int[] rem = new int[255];
            for(int i=0;i<t.length();i++)rem[t.charAt(i)]++;
            while(right<s.length())
            {
                if(rem[s.charAt(right)]>0)count--;
                rem[s.charAt(right)]--;
                if(count==0)
                {
                    while(left<right && rem[s.charAt(left)]<0)
                    {
                        rem[s.charAt(left)]++;
                        left++;
                    }
                    if(right-left+1<=size)
                    {
                        start=left;
                        size=right-left+1;
                    }
                    rem[s.charAt(left)]++;
                    left++;
                    count++;
                }
                right++;
            }
            return start==-1?"":s.substring(start,start+size);
        }
    }
}
