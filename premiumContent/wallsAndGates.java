public class Solution {
    /**
     * @param rooms: m x n 2D grid
     * @return: nothing
     */
    public void wallsAndGates(int[][] rooms) {
        for(int i=0;i<rooms.length;i++){
            for(int j=0;j<rooms[i].length;j++){
                if(rooms[i][j] == 0){
                    dfs(rooms, i, j, 0);
                }
            }
        }
    }
    
    public void dfs(int [][] rooms, int i, int j, int count){
        if(i<0 || i>=rooms.length || j<0 || j>=rooms[i].length || rooms[i][j] < count){
            return;
        }
        rooms[i][j] = count;
        dfs(rooms, i-1, j, count+1);
        dfs(rooms, i+1,j, count+1);
        dfs(rooms,i,j-1,count+1);
        dfs(rooms,i,j+1,count+1);
    }
}




//Problem Statement
You are given a m x n 2D grid initialized with these three possible values.

-1 - A wall or an obstacle.
0 - A gate.
INF - Infinity means an empty room. We use the value 2^31 - 1 = 2147483647 to represent INF as you may assume that the distance to a gate is less than 2147483647.
Fill each empty room with the distance to its nearest gate. If it is impossible to reach a Gate, that room should remain filled with INF

Example
Example1

Input:
[[2147483647,-1,0,2147483647],[2147483647,2147483647,2147483647,-1],[2147483647,-1,2147483647,-1],[0,-1,2147483647,2147483647]]
Output:
[[3,-1,0,1],[2,2,1,-1],[1,-1,2,-1],[0,-1,3,4]]

Explanation:
the 2D grid is:
INF  -1  0  INF
INF INF INF  -1
INF  -1 INF  -1
  0  -1 INF INF
the answer is:
  3  -1   0   1
  2   2   1  -1
  1  -1   2  -1
  0  -1   3   4
Example2

Input:
[[0,-1],[2147483647,2147483647]]
Output:
[[0,-1],[1,2]]
