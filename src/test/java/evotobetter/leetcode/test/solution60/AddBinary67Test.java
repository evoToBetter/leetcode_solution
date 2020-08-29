package evotobetter.leetcode.test.solution60;

import evotobetter.leetcode.solution60.AddBinary67;
import evotobetter.leetcode.solution60.AddBinary67_2;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AddBinary67Test {
    private AddBinary67 func;

    @BeforeClass
    public void setup(){
        func=new AddBinary67_2();
    }

    @Test
    public void testAddBinary(){
        String a="10";
        String b="111";
        String actual=func.addBinary(a,b);
        String expect="1001";
        Assert.assertEquals(actual,expect);
    }

    @Test
    public void testAddBinary1(){
        String a="";
        String b="111";
        String actual=func.addBinary(a,b);
        String expect="111";
        Assert.assertEquals(actual,expect);
    }

    @Test
    public void testAddBinary2(){
        String a="101";
        String b="111";
        String actual=func.addBinary(a,b);
        String expect="1100";
        Assert.assertEquals(actual,expect);
    }
}
