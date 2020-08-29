package evotobetter.leetcode.test.solution50;

import evotobetter.leetcode.solution50.NQueens51;
import evotobetter.leetcode.solution50.NQueens51_1;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Set;

public class NQueens51Test {

    private NQueens51 func;

    @BeforeClass
    public void setup(){
        func=new NQueens51_1();
    }

    @Test
    public void testSolveNQueens(){
        List<List<String>> results=func.solveNQueens(4);
        int i=1;
        for(List<String> result: results){
            System.out.println(i++);
            for(String row:result){
                System.out.println(row);
            }
        }
    }

    @Test
    public void testOccupiedSet(){
        NQueens51_1 func=new NQueens51_1();
        int n=8;
        Set<Integer> occupiedPosSet=func.occupiedPos(n,1,2);
        for(Integer pos:occupiedPosSet){
            System.out.println(String.format("x: %d, y:%d", pos/n, pos%n));
        }
    }
}
