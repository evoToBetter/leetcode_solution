package evotobetter.leetcode.solution50;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NQueens51_1 implements NQueens51 {
    @Override
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result=new ArrayList<>();
        for(int i=0; i<n; i++){
            List<List<String>> solution=solveNQueens(n,i,0,new HashSet<>());
            if(solution.size()>0){
                result.addAll(solution);
            }
        }
//        result=removeDup(n,result);
        return result;
    }

    public List<List<String>> solveNQueens(int n, int xPos, int yPos, Set<Integer> occupiedPosSet){
        List<List<String>> result=new ArrayList<>();
        if(yPos==n-1){
            List<String> img=new ArrayList<>();
            img.add(posImg(n,xPos));
            result.add(img);
            return result;
        }
        Set<Integer> currentOcuppiedPos=occupiedPos(n, xPos, yPos);
        currentOcuppiedPos.addAll(occupiedPosSet);
        String currentRow=posImg(n,xPos);
        int nextRow=yPos+1;
        for(int i=0; i<n; i++){
            if(i==xPos){
                continue;
            }
            int testPosCode=encodePos(n,i,nextRow);
            if(!currentOcuppiedPos.contains(testPosCode)){
                List<List<String>> tmpResult=solveNQueens(n,i,nextRow,currentOcuppiedPos);
                if(tmpResult.size()>0){
                    for(List<String> imgList: tmpResult){
                        List<String> tmpImg=new ArrayList<>();
                        tmpImg.add(currentRow);
                        tmpImg.addAll(imgList);
                        result.add(tmpImg);
                    }
                }

            }
        }

        return result;
    }

    private List<List<String>> removeDup(int n, List<List<String>> result){
        Set<String> uniquePos=new HashSet<>();
        List<List<String>> finalResult=new ArrayList<>();
        for(List<String> solution: result){
            if(!uniquePos.contains(convertImgToStr(solution))){
                finalResult.add(solution);
                addUniquePos(n,solution,uniquePos);
            }
        }
        return finalResult;
    }

    private String convertImgToStr(List<String> solution){
        StringBuilder sb=new StringBuilder();
        for(String row:solution){
            sb.append(row);
        }
        return sb.toString();
    }

    private void addUniquePos(int n, List<String> solution, Set<String> uniquePos){
        uniquePos.add(convertImgToStr(solution));
        char[][] pointMap=new char[n][n];
        for(int i=0; i<n;i++){
            String s=solution.get(i);
            for(int j=0; j<n;j++){
                if(s.charAt(j)=='Q'){
                    pointMap[i][j]='Q';
                }
            }
        }
        uniquePos.addAll(mirror(n,pointMap));
        pointMap=new char[n][n];
        for(int i=0; i<n;i++){
            String s=solution.get(i);
            for(int j=0; j<n;j++){
                if(s.charAt(j)=='Q'){
                    pointMap[j][n-1-i]='Q';
                }
            }
        }
        uniquePos.add(convertMapToString(n,pointMap));
//        uniquePos.addAll(mirror(n,pointMap));
        pointMap=new char[n][n];
        for(int i=0;i<n;i++){
            String s=solution.get(i);
            for(int j=0; j<n; j++){
                if(s.charAt(j)=='Q'){
                    pointMap[n-1-i][n-1-j]='Q';
                }
            }
        }
        uniquePos.add(convertMapToString(n,pointMap));
//        uniquePos.addAll(mirror(n,pointMap));
        pointMap=new char[n][n];
        for(int i=0; i<n; i++){
            String s=solution.get(i);
            for(int j=0; j<n; j++){
                if(s.charAt(j)=='Q'){
                    pointMap[n-1-j][i]='Q';
                }
            }
        }
        uniquePos.add(convertMapToString(n,pointMap));
//        uniquePos.addAll(mirror(n,pointMap));
    }

    private List<String> mirror(int n, char[][] pointMap){
        char[][] newPointMap=new char[n][n];
        List<String> mirrorStr=new ArrayList<>();
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(pointMap[j][i]=='Q'){
                    newPointMap[j][n-1-i]='Q';
                }
            }
        }
        mirrorStr.add(convertMapToString(n,pointMap));
        newPointMap=new char[n][n];
        for(int i=0; i< n; i++){
            for(int j=0; j<n; j++){
                if(pointMap[j][i]=='Q'){
                    newPointMap[n-1-j][i]='Q';
                }
            }
        }
        mirrorStr.add(convertMapToString(n,newPointMap));
        return mirrorStr;
    }

    private String convertMapToString(int n, char[][] pointMap){
        StringBuilder imgPos=new StringBuilder();
        for(int i=0;i<n;i++){
            for(int j=0; j<n; j++){
                if(pointMap[j][i]=='Q'){
                    imgPos.append('Q');
                }else{
                    imgPos.append('.');
                }
            }
        }
        return imgPos.toString();
    }

    private String posImg(int n, int xPos){
        StringBuilder img=new StringBuilder();
        for(int i=0; i<n; i++){
            if(i==xPos){
                img.append('Q');
            }else{
                img.append('.');
            }
        }
        return img.toString();
    }

    public Set<Integer> occupiedPos(int n, int xPos, int yPos){
        Set<Integer> occpiedPosSet=new HashSet<>();
        int x=xPos;
        int y=yPos;
        while(y<n){
            int pos=encodePos(n,x,y);
            occpiedPosSet.add(pos);
            y++;
        }
        x=xPos-1;
        y=yPos+1;
        while(x>=0&&y<n){
            int pos=encodePos(n,x,y);
            occpiedPosSet.add(pos);
            x--;
            y++;
        }
        x=xPos+1;
        y=yPos+1;
        while(x<n&&y<n){
            int pos=encodePos(n,x,y);
            occpiedPosSet.add(pos);
            x++;
            y++;
        }
        return occpiedPosSet;
    }

    private int encodePos(int n, int x, int y){
        return x*n+y;
    }
}
