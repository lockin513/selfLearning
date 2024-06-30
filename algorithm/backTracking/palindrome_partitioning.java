import java.util.ArrayList;
import java.util.List;

public class palindrome_partitioning {
    class Solution {
        List<List<String>> ans = new ArrayList<>();
        List<String> path = new ArrayList<>();
        public List<List<String>> partition(String s) {
            backTracking(s,0);
            return ans;
        }
        public void backTracking(String s, int startIndex){
            if(startIndex==s.length())
            {
                ans.add(new ArrayList<>(path));
                return;
            }
            for(int i=startIndex;i<s.length();i++)
            {
                String str = s.substring(startIndex,i+1);
                if(!isHuiWen(str))continue;
                else
                {
                    path.add(str);
                    backTracking(s,i+1);
                    path.remove(path.size()-1);
                }
            }
        }
        public boolean isHuiWen(String s){
            int left = 0;
            int right = s.length()-1;
            while(left<right)
                if(s.charAt(left++)!=s.charAt(right--))return false;
            return true;
        }
    }
}
