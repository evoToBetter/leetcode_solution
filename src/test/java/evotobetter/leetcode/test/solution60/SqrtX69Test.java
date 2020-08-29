package evotobetter.leetcode.test.solution60;

import evotobetter.leetcode.solution60.SqrtX69;
import evotobetter.leetcode.solution60.SqrtX69_1;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SqrtX69Test {
    private SqrtX69 func;

    @BeforeClass
    public void setup(){
        func=new SqrtX69_1();
    }

    @Test
    public void testMySqrt(){
        int result=func.mySqrt(2147395599);
        System.out.println(result);
        Assert.assertEquals(result,46339);
    }

    @Test
    public void testMySqrt1(){
        int result=func.mySqrt(1025);
        System.out.println(result);
        Assert.assertEquals(result,32);
    }
}
