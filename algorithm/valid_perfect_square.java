public class valid_perfect_square {
    public boolean isPerfectSquare(int num) {
        int l = 0, r = num;
        int mid = 0;
        while(l<=r)
        {
            mid = (r-l)/2+l;
            if((long)mid*mid<=num)
            {
                l = mid+1;
            }
            else r = mid-1;
        }
        if((long)r*r!=num)return false;
        else return true;
    }
}
