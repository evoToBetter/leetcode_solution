package evotobetter.leetcode.test.solution50;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NQueens52Test {

    private NQueens52 func;

    @BeforeClass
    public void setup(){
        func=new NQueens52_1();
    }


    @Test
    public void test1(){
        int result=func.totalNQueens(4);
        System.out.println(result);
    }
}
