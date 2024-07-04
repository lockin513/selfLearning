import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class n_queens {
    class Solution {
        public List<List<String>> ans = new ArrayList<>();
        public List<List<String>> solveNQueens(int n) {
            char[][] chessboard = new char[n][n];
            for (char[] c : chessboard) {
                Arrays.fill(c, '.');
            }
            backTracking(n,0,chessboard);
            return ans;
        }
        public void backTracking(int n, int row, char[][] chessboard){
            if(row==n){
                ans.add(new ArrayList<>(Array2List(chessboard)));
                return;
            }
            for(int col=0;col<n;col++)
            {
                chessboard[row][col]='Q';
                if(isValid(n,row,col,chessboard))backTracking(n,row+1,chessboard);
                chessboard[row][col]='.';
            }
        }
        public boolean isValid(int n, int row, int col, char[][] chessboard){
            for(int i=0;i<row;i++)
                if(chessboard[i][col]=='Q')return false;
            for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
                if(chessboard[i][j]=='Q')return false;
            }
            for(int i=row-1,j=col+1;i>=0 && j<n;i--,j++)
                if(chessboard[i][j]=='Q')return false;
            return true;
        }
        public List Array2List(char[][] chessboard) {
            List<String> list = new ArrayList<>();
            for (char[] c : chessboard) {
                list.add(String.copyValueOf(c));
            }
            return list;
        }
    }
}
