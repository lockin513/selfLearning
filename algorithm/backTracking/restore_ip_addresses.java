import java.util.ArrayList;
import java.util.List;

public class restore_ip_addresses {
    class Solution {
        List<String> ans = new ArrayList<>();
        public List<String> restoreIpAddresses(String s) {
            if(s.length()>12)return ans;
            StringBuilder path = new StringBuilder(s);
            backTracking(path,0,0);
            return ans;
        }
        public void backTracking(StringBuilder path, int startIndex, int dot){
            if(dot==3)
            {
                if(!isValid(path,startIndex,path.length()-1))return;
                ans.add(path.toString());
                return;
            }
            for(int i=startIndex;i<path.length();i++)
            {
                if(!isValid(path,startIndex,i))continue;
                path.insert(i+1,".");
                backTracking(path,i+2,dot+1);
                path.deleteCharAt(i+1);
            }
        }
        public boolean isValid(StringBuilder s, int startIndex, int end){
            if(startIndex>end)return false;
            if(s.charAt(startIndex)=='0' && end>startIndex)return false;
            int sum = 0;
            for(int i=startIndex;i<=end;i++){
                int digit = s.charAt(i)-'0';
                sum = sum*10 + digit;
                if(sum>255)return false;
            }
            return true;
        }
    }
}
