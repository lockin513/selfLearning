import java.util.ArrayList;
import java.util.List;

public class letter_combinations_of_a_phone_number {
    class Solution {
        String[] str = new String[]{"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        StringBuilder path = new StringBuilder();
        List<String> ans = new ArrayList<>();
        public List<String> letterCombinations(String digits) {
            if(digits.length()==0)return ans;
            backTracking(digits,0);
            return ans;
        }
        public void backTracking(String digits,int startIndex){
            if(path.length()==digits.length())
            {
                ans.add(path.toString());
                return;
            }
            String temp = str[digits.charAt(startIndex)-'0'];
            for(int i=0;i<temp.length();i++)
            {
                path.append(temp.charAt(i));
                backTracking(digits,startIndex+1);
                path.deleteCharAt(path.length()-1);
            }
        }
    }
}
