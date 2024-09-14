public class fibonacci_number {
    class Solution {
        public int fib(int n) {
            int[] rem = new int[31];
            rem[0]=0;
            rem[1]=1;
            for(int i=2;i<=n;i++)rem[i]=rem[i-2]+rem[i-1];
            return rem[n];
        }
    }
}
