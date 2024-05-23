public class shun_shi_zhen_da_yin_ju_zhen_lcof {
    public int[] spiralArray(int[][] array) {
        int row = array.length;
        if(row==0)return new int[0];
        int col = array[0].length;
        int[] ans = new int[row*col];
        if(row*col==0)return ans;
        int left = 0, right = col-1, up = 0, down = row-1;
        int rem=0;
        while(true)
        {
            for(int i=left;i<=right;i++)ans[rem++]=array[up][i];
            if(++up>down)break;
            for(int i=up;i<=down;i++)ans[rem++]=array[i][right];
            if(--right<left)break;
            for(int i=right;i>=left;i--)ans[rem++]=array[down][i];
            if(--down<up)break;
            for(int i=down;i>=up;i--)ans[rem++]=array[i][left];
            if(++left>right)break;
        }
        return ans;
    }
}
