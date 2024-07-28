public class fruit_into_baskets {
    class Solution {
        public int totalFruit(int[] fruits) {
            int[] rem = new int[fruits.length];
            int left=0,right=0,num=0,count=0,ans=0;
            while(right<fruits.length)
            {
                if(rem[fruits[right]]!=0 || num<2)
                {
                    if(rem[fruits[right]]==0)num++;
                    rem[fruits[right]]++;
                    ans=Math.max(ans,++count);
                    right++;
                }
                else
                {
                    while(true)
                    {
                        rem[fruits[left]]--;
                        if(rem[fruits[left]]==0)num--;
                        left++;
                        count--;
                        if(num!=2)break;
                    }
                }
            }
            return ans;
        }
    }
}
