//Day_8
class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        for(int i=2;i<coordinates.length;i++){
            if((coordinates[1][1]-coordinates[0][1])*(coordinates[i][0]-coordinates[0][0]) !=
              (coordinates[1][0]-coordinates[0][0])*(coordinates[i][1]-coordinates[0][1])){
                return false;
            }
        }
    return true;
    }
}
