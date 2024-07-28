public class shun_shi_zhen_da_yin_ju_zhen_lcof {
    class Solution {
        public int[] spiralArray(int[][] array) {
            if(array.length==0)return new int[0];
            int up=0, down=array.length-1, left=0, right=array[0].length-1, num=0;
            int[] ans = new int[(down+1)*(right+1)];
            while(true)
            {
                for(int i=left;i<=right;i++)ans[num++]=array[up][i];
                if(++up>down)break;
                for(int i=up;i<=down;i++)ans[num++]=array[i][right];
                if(--right<left)break;
                for(int i=right;i>=left;i--)ans[num++]=array[down][i];
                if(--down<up)break;
                for(int i=down;i>=up;i--)ans[num++]=array[i][left];
                if(++left>right)break;
            }
            return ans;
        }
    }
}
