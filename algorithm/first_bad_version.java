//leetcode278 第一个错误的版本
public class first_bad_version {
    public int firstBadVersion(int n) {
        int l = 0, r = n-1;
        int p = 0;
        while(l<=r)
        {
            p = l + (r-l)/2;
            if(isBadVersion(p)) r = p-1;
            else l = p+1;
        }
        return l;
    }

    public boolean isBadVersion(int n) {
        return n < 1;
    }
}
