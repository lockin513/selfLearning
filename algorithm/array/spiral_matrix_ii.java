public class spiral_matrix_ii {
    public int[][] generateMatrix(int n) {
        int[][] ans = new int[n][n];
        int[][] add = {{0,1},{1,0},{0,-1},{-1,0}};
        int index = 0;
        int i=0,j=0;
        int rem = 1;
        ans[0][0] = 1;
        while(rem<n*n)
        {
            if(i+add[index][0]>=n || i+add[index][0]<0 || j+add[index][1]>=n || j+add[index][1]<0 || ans[i+add[index][0]][j+add[index][1]]!=0)
            {
                index = (index+1)%4;
            }
            else
            {
                i+=add[index][0];
                j+=add[index][1];
                ans[i][j] = rem+1;
                rem++;
            }
        }
        return ans;
    }
}
