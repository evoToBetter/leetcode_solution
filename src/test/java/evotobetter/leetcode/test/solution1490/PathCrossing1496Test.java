package evotobetter.leetcode.test.solution1490;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PathCrossing1496Test {
    private PathCrossing1496 func;

    @BeforeClass
    public void setup(){
        func=new PathCrossing1496_1();
    }

    @Test
    public void testPathCrossing(){
        String path="WSSESEEE";
        boolean result=func.isPathCrossing(path);
        System.out.println(result);
    }

}
