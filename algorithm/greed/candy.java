public class candy {
    class Solution {
        public int candy(int[] ratings) {
            int[] ans = new int[ratings.length];
            ans[0]=1;
            for(int i=1;i<ratings.length;i++)
            {
                if(ratings[i]>ratings[i-1]) ans[i]=ans[i-1]+1;
                else ans[i]=1;
            }
            int candy = ans[ratings.length-1];
            for(int i=ratings.length-2;i>=0;i--)
            {
                if(ratings[i]>ratings[i+1])
                    ans[i] = Math.max(ans[i+1]+1,ans[i]);
                candy+=ans[i];
            }
            return candy;
        }
    }
}
