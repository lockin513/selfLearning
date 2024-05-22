import java.util.ArrayList;
import java.util.List;

public class spiral_matrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        List<Integer> ans = new ArrayList<>();
        int s=0,x=row-1,z=0,y=col-1;
        while(true)
        {
            for(int i=z;i<=y;i++) //从左到右
            {
                ans.add(Integer.valueOf(matrix[s][i]));
            }
            if(++s>x)break;
            for(int i=s;i<=x;i++) //从上到下
            {
                ans.add(Integer.valueOf(matrix[i][y]));
            }
            if(--y<z)break;
            for(int i=y;i>=z;i--) //从右到左
            {
                ans.add(Integer.valueOf(matrix[x][i]));
            }
            if(--x<s)break;
            for(int i=x;i>=s;i--) //从下到上
            {
                ans.add(Integer.valueOf(matrix[i][z]));
            }
            if(++z>y)break;
        }
        return ans;
    }
}
