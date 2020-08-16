package evotobetter.leetcode.test.solution60;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.Arrays;

public class PlusOne66Test {
    private PlusOne66 func;

    @BeforeClass
    public void setup(){
        func=new PlusOne66_1();
    }

    @Test
    public void testAllNine(){
        int[] digits=new int[5];
        Arrays.setAll(digits,i->9);
        int[] result=func.plusOne(digits);
        Assert.assertEquals(result.length,digits.length+1);
        Assert.assertEquals(result[0],1);
        for(int i=1; i<result.length;i++){
            Assert.assertEquals(result[i],0);
        }
    }

    @Test
    public void testEndWithNine(){
        int[] digits={1,9,9};
        int[] result=func.plusOne(digits);
        Assert.assertEquals(result[0],2);
        Assert.assertEquals(result[1],0);
        Assert.assertEquals(result[2],0);
    }
}
