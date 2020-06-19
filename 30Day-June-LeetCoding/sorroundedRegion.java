class Solution {
    public void solve(char[][] board) {
        if(board.length == 0 || board[0].length == 0){
            return ;
        }
        for(int i=0;i<board.length;i++){
            if(board[i][0] == 'O') bfs(board, i , 0);
            if(board[i][board[0].length-1] == 'O') bfs(board, i , board[0].length-1);
        }
        for(int j=0;j<board[0].length;j++){
            if(board[0][j] == 'O') bfs(board, 0 , j);
            if(board[board.length-1][j] == 'O') bfs(board, board.length-1 , j);
        }
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                if(board[i][j] == 'O'){
                    board[i][j] = 'X';
                } else if(board[i][j] == '*'){
                    board[i][j] = 'O';
                }
            }
        }
        
    }
    
    public void bfs(char [][] board, int i, int j){
        if(i<0 || j<0 || i>=board.length || j>= board[i].length){
            return;
        }
        if(board[i][j] == 'O'){
            board[i][j] = '*';
        }
        
        
        if(i>0 && board[i-1][j] == 'O'){
            bfs(board, i-1, j);
        }
        if(j>0 && board[i][j-1] == 'O'){
            bfs(board, i, j-1);
        }
        if(i<board.length-1 && board[i+1][j] == 'O'){
            bfs(board, i+1, j);
        }
        if(j<board[i].length-1 && board[i][j+1] == 'O'){
            bfs(board, i, j+1);
        }
        return;
    }
}
