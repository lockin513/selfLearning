//leetcode278 第一个错误的版本
public class first_bad_version {
    public int firstBadVersion(int n) {
        int l = 0, r = n-1;
        int p = 0;
        while(l<=r)
        {
            p = l + (r-l)/2;
            if(isBadVersion(p))
            {
                r = p-1;
            }
            else if(!isBadVersion(p))
            {
                l = p+1;
            }
        }
        if(isBadVersion(p))return p;
        else return p+1;
    }
}
