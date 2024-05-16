public class sqrtx {
    public int mySqrt(int x) {
        int l = 0, r = x, ans = 0;
        int mid = 0;
        while(l<=r)
        {
            mid = (r-l)/2+l;
            if((long)mid*mid<=x)
            {
                l = mid+1;
            }
            else
            {
                r = mid-1;
            }
        }
        return r;
    }
}
