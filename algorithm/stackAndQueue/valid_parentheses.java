import java.util.*;

public class valid_parentheses {
    class Solution {
        public boolean isValid(String s) {
            if(s.length()%2!=0)return false;
            Stack<Character> stack = new Stack<>();
            for(int i=0;i<s.length();i++)
            {
                char c = s.charAt(i);
                if(c=='(' || c=='{' || c=='[')stack.push(s.charAt(i));
                if(stack.isEmpty())return false;
                if(c==')' && stack.pop()!='(')return false;
                if(c=='}' && stack.pop()!='{')return false;
                if(c==']' && stack.pop()!='[')return false;
            }
            if(stack.isEmpty())return true;
            else return false;
        }
    }
}
