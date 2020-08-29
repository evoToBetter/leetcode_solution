package evotobetter.leetcode.test.solution50;

import evotobetter.leetcode.solution50.LengthOfLastWord58;
import evotobetter.leetcode.solution50.LengthOfLastWord58_2;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LengthOfLastWord58Test {
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
