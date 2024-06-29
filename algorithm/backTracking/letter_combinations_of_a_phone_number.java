import java.util.ArrayList;
import java.util.List;

public class letter_combinations_of_a_phone_number {
    class Solution {
        List<String> ans = new ArrayList<>();
        StringBuilder path = new StringBuilder();
        String[] str = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        public List<String> letterCombinations(String digits) {
            if(digits.length()==0)return ans;
            backTracking(digits,0);
            return ans;
        }
        public void backTracking(String digits,int index){
            if(index==digits.length())
            {
                ans.add(path.toString());
                return;
            }
            String cha = str[digits.charAt(index)-'0'];
            for(int i=0;i<cha.length();i++)
            {
                path.append(cha.charAt(i));
                backTracking(digits,index+1);
                path.deleteCharAt(path.length()-1);
            }
        }
    }
}
