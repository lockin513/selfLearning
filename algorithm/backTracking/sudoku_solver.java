public class sudoku_solver {
    class Solution {
        public void solveSudoku(char[][] board) {
            backTracking(board);
        }
        public boolean backTracking(char[][] board){
            for(int i=0;i<9;i++)
                for(int j=0;j<9;j++)
                    if(board[i][j]=='.')
                    {
                        for(char num='1';num<='9';num++)
                        {
                            if(isValid(board,i,j,num))
                            {
                                board[i][j]=num;
                                if(backTracking(board))return true;
                                board[i][j]='.';
                            }
                        }
                        return false;
                    }
            return true;
        }
        public boolean isValid(char[][] board, int row, int col, char num){
            // 一行中是否重复
            for(int i=0;i<9;i++)
                if(board[row][i]==num)return false;
            // 一列中是否重复
            for(int i=0;i<9;i++)
                if(board[i][col]==num)return false;
            // 九宫格内是否重复
            int beginRow = (row/3)*3;
            int beginCol = (col/3)*3;
            for(int i=beginRow;i<beginRow+3;i++)
                for(int j=beginCol;j<beginCol+3;j++)
                    if(board[i][j]==num)return false;
            return true;
        }
    }
}
