import java.util.HashSet;
import java.util.Set;

public class happy_number {
    class Solution {
        public boolean isHappy(int n) {
            Set<Integer> set = new HashSet<>();
            while(true)
            {
                if(n==1)return true;
                else if(set.contains(n))return false;
                else
                {
                    set.add(n);
                    n=nextNum(n);
                }
            }
        }
        public int nextNum(int n){
            int ans=0;
            while(n>0)
            {
                int temp = n%10;
                n/=10;
                ans+=temp*temp;
            }
            return ans;
        }
    }
}
