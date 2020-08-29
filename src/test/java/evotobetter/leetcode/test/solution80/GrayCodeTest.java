package evotobetter.leetcode.test.solution80;

import evotobetter.leetcode.solution80.GrayCode89;
import evotobetter.leetcode.solution80.GrayCode89_3;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class GrayCodeTest {
    private GrayCode89 func;

    @BeforeClass
    public void setup(){
        func=new GrayCode89_3();
    }

    @Test
    public void testGrayCode(){
        int n=3;
        List<Integer> result =func.grayCode(n);
        Assert.assertEquals(result.size(),(int)Math.pow(2,n));
        for(int i=1; i<result.size();i++){
            if(!isPower2(Math.abs(result.get(i)-result.get(i-1)))){
                System.out.println(result.get(i)+" and "+result.get(i-1)+" not meet the requirement of gray code");
                Assert.fail();
            }
        }
    }

    public static void main(String[] args){
        System.out.println(Integer.toBinaryString(-5));
        System.out.println(Integer.toBinaryString(5));
        System.out.println(5&-5);
        System.out.println((5&-5)<<1);
        System.out.println(5^((5&-5)<<1));
    }

    private boolean isPower2(int n){
        if(n<1){
            return false;
        }
        return (n&(n-1))==0;
    }
}
