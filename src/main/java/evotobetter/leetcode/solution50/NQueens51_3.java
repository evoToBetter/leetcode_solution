package evotobetter.leetcode.test.solution50;

import evotobetter.leetcode.solution50.NQueens51;

import java.util.ArrayList;
import java.util.List;

/*
*  recursive find possible solution,
*  using int[][] map to record already occupied pos.
* Runtime: 2 ms, faster than 96.22% of Java online submissions for N-Queens.
Memory Usage: 39.3 MB, less than 95.45% of Java online submissions for N-Queens.
 */
public class NQueens51_3 implements NQueens51 {
    @Override
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result=new ArrayList<>();
        int[][] map=new int[n][n];
        for(int i=0; i<n; i++){
            solveNQueens(n,i,0, map,result);
        }
        return result;
    }

    public void solveNQueens(int n, int xPos, int yPos, int[][] map, List<List<String>> result){
        if(yPos==n-1){
            List<String> img=new ArrayList<>();
            for(int i=0; i<n; i++){
                img.add(posStr(n,i,map));
            }
            result.add(img);
            return;
        }
        occupyPos(n,xPos,yPos,map);
        int nextRow=yPos+1;
        for(int i=0; i<n; i++){
            if(i==xPos){
                continue;
            }
            if(map[nextRow][i]==0){
                solveNQueens(n,i,nextRow,map,result);
            }
        }
        unOccupyPos(n,xPos,yPos,map);
    }

    private String posStr(int n, int ypos, int[][] map){
        StringBuilder sb=new StringBuilder();
        for(int i=0; i<n; i++){
            if(map[ypos][i]>0){
                sb.append('.');
            }else{
                sb.append('Q');
            }
        }
        return sb.toString();
    }

    private void occupyPos(int n, int xPos, int yPos, int[][] map){
        // vertical pos
        for(int i=yPos+1; i<n;i++){
            map[i][xPos]++;
        }
        //horizontal pos
        for(int i=0; i<n;i++){
            if(i!=xPos){
                map[yPos][i]++;
            }
        }
        // diagonal right pos
        int x = xPos-1;
        int y = yPos+1;
        while(y<n&&x>=0){
            map[y][x]++;
            x--;
            y++;
        }
        //diagonal left pos
        x=xPos+1;
        y=yPos+1;
        while(y<n&&x<n){
            map[y][x]++;
            x++;
            y++;
        }
    }

    private void unOccupyPos(int n, int xPos, int yPos, int[][] map){
        // vertical pos
        for(int i=yPos+1; i<n;i++){
            map[i][xPos]--;
        }
        //horizontal pos
        for(int i=0; i<n;i++){
            if(i!=xPos){
                map[yPos][i]--;
            }
        }
        // diagonal right pos
        int x = xPos-1;
        int y = yPos+1;
        while(y<n&&x>=0){
            map[y][x]--;
            x--;
            y++;
        }
        //diagonal left pos
        x=xPos+1;
        y=yPos+1;
        while(y<n&&x<n){
            map[y][x]--;
            x++;
            y++;
        }
    }
}
