package evotobetter.leetcode.test.solution50;

import java.util.ArrayList;
import java.util.List;

public class NQueens52_1 implements NQueens52{

    @Override
    public int totalNQueens(int n) {
        int result=0;
        int[][] map=new int[n][n];
        for(int i=0; i<n; i++){
            result+=solveNQueens(n,i, 0, map);
        }
        return result;
    }

    public int solveNQueens(int n, int xPos, int yPos, int[][] map){
        if(yPos==n-1){
            return 1;
        }
        int result=0;
        occupyPos(n,xPos,yPos,map);
        int nextRow=yPos+1;
        for(int i=0; i<n; i++){
            if(i==xPos){
                continue;
            }
            if(map[nextRow][i]==0){
                result+=solveNQueens(n,i,nextRow,map);
            }
        }
        unOccupyPos(n,xPos,yPos,map);
        return result;
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
