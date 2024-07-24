public class sqrtx {
    class Solution {
        public int mySqrt(int x) {
            int l=1,r=x/2+1;
            while(l<=r)
            {
                int mid = (r-l)/2+l;
                if((long)mid*mid<=x)l=mid+1;
                else r=mid-1;
            }
            return r;
        }
    }
}
