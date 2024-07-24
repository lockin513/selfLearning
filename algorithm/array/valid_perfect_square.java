public class valid_perfect_square {
    class Solution {
        public boolean isPerfectSquare(int num) {
            int l=1,r=num/2+1;
            while(l<=r)
            {
                int mid = (r-l)/2+l;
                if((long)mid*mid<=num)l=mid+1;
                else r=mid-1;
            }
            if((long)r*r==num)return true;
            else return false;
        }
    }
}
