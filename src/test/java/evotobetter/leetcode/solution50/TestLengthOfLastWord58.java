package evotobetter.leetcode.solution50;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestLengthOfLastWord58 {
    private LengthOfLastWord58 func;

    @BeforeClass
    public void setup(){
        func=new LengthOfLastWord58_2();
    }

    @Test
    public void testLengthOfLastWord(){
        String s="Hello World";
        int len=func.lengthOfLastWord(s);
        Assert.assertEquals(len,5);
    }

    @Test
    public void testWithEmpty(){
        String s1="";
        int len1=func.lengthOfLastWord(s1);
        Assert.assertEquals(len1,0);
    }

}
