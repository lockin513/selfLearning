import java.util.ArrayList;
import java.util.List;

public class spiral_matrix {
    class Solution {
        public List<Integer> spiralOrder(int[][] matrix) {
            List<Integer> ans = new ArrayList<>();
            int up=0,down=matrix.length-1,left=0,right=matrix[0].length-1;
            while(true)
            {
                for(int i=left;i<=right;i++)ans.add(matrix[up][i]);
                if(++up>down)break;
                for(int i=up;i<=down;i++)ans.add(matrix[i][right]);
                if(--right<left)break;
                for(int i=right;i>=left;i--)ans.add(matrix[down][i]);
                if(--down<up)break;
                for(int i=down;i>=up;i--)ans.add(matrix[i][left]);
                if(++left>right)break;
            }
            return ans;
        }
    }
}
