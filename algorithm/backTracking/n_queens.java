import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class n_queens {
    class Solution {
        int[][] board = new int[9][9];
        List<List<String>> ans = new ArrayList<>();
        public List<List<String>> solveNQueens(int n) {
            backTracking(n,0);
            return ans;
        }
        public void backTracking(int n,int startIndex){
            if(startIndex==n)
            {
                ans.add(new ArrayList<>(board2ArrayList(n)));
                return;
            }
            for(int i=0;i<n;i++)
            {
                if(isValid(n,startIndex,i))
                {
                    board[startIndex][i]=1;
                    backTracking(n,startIndex+1);
                    board[startIndex][i]=0;
                }
            }
        }
        public boolean isValid(int n,int row,int col){
            //判断这一列是否可以放
            for(int i=0;i<n;i++)
                if(board[i][col]==1)return false;
            //判断这一行是否可以放
            for(int i=0;i<n;i++)
                if(board[row][i]==1)return false;
            //判断左上斜线是否可以放
            for(int i=row,j=col;i>=0 && j>=0;i--,j--)
                if(board[i][j]==1)return false;
            //判断右上斜线是否可以放
            for(int i=row,j=col;i>=0 && j<n;i--,j++)
                if(board[i][j]==1)return false;
            return true;
        }
        public List<String> board2ArrayList(int n){
            List<String> res = new ArrayList<>();
            for(int i=0;i<n;i++)
            {
                StringBuilder sb = new StringBuilder();
                for(int j=0;j<n;j++)
                    if(board[i][j]==1)sb.append('Q');
                    else sb.append('.');
                res.add(sb.toString());
            }
            return res;
        }
    }
}
