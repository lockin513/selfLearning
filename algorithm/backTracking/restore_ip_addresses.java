import java.util.ArrayList;
import java.util.List;

public class restore_ip_addresses {
    class Solution {
        List<String> path = new ArrayList<>();
        List<String> ans = new ArrayList<>();
        public List<String> restoreIpAddresses(String s) {
            backTracking(s,0);
            return ans;
        }
        public void backTracking(String s,int startIndex){
            if(path.size()>4)return;
            if(startIndex==s.length() && path.size()==4)
            {
                StringBuilder sb = new StringBuilder();
                for(int i=0;i<path.size()-1;i++)
                    sb.append(path.get(i)+".");
                sb.append(path.get(path.size()-1));
                ans.add(sb.toString());
                return;
            }
            for(int i=startIndex;i<s.length() && i<startIndex+4;i++)
            {
                String str = s.substring(startIndex,i+1);
                if(isValid(str))
                {
                    path.add(str);
                    backTracking(s,i+1);
                    path.remove(path.size()-1);
                }
            }
        }
        public boolean isValid(String str){
            if(str.length()>1 && str.charAt(0)=='0')return false;
            int num=0;
            int mul=1;
            for(int i=str.length()-1;i>=0;i--){
                int digit = str.charAt(i)-'0';
                num+=digit*mul;
                mul*=10;
            }
            if(num>255)return false;
            return true;
        }
    }
}
