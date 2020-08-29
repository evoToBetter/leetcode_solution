package evotobetter.leetcode.solution1490;

import java.util.HashSet;
import java.util.Set;

public class PathCrossing1496_1 implements PathCrossing1496 {
    @Override
    public boolean isPathCrossing(String path) {
        // position records
        Set<Integer> records=new HashSet<>();
        // visit result
        boolean result=false;
        int x=0;
        int y=0;
        checkVisit(x,y,records);
        for(int i=0; i<path.length();i++){
            switch (path.charAt(i)){
                case 'N':
                    y++;
                    result=checkVisit(x,y,records);
                    if(result) return result;
                    continue;
                case 'S':
                    y--;
                    result=checkVisit(x,y,records);
                    if(result) return result;
                    continue;
                case 'E':
                    x++;
                    result=checkVisit(x,y,records);
                    if(result) return result;
                    continue;
                case 'W':
                    x--;
                    result=checkVisit(x,y,records);
                    if(result) return result;
                    continue;
            }
        }
        return result;
    }
    // check visit every step
    private boolean checkVisit(int x, int y, Set<Integer> records){
        int maskx=x>=0?0:0x8000;
        int masky=y>=0?0:0x0080;
        int checkNum=(Math.abs(x)<<16|maskx)|(Math.abs(y)|masky);
        if(records.contains(checkNum)){
            return true;
        }else{
            records.add(checkNum);
            return false;
        }
    }
}
