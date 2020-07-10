package evotobetter.leetcode.solution50;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MaximumSubarray53Test {
    private MaximumSubarray53 func;

    @BeforeClass
    public void setup(){
        func=new MaximumSubarray53_1();
    }

    @Test
    public void testWithArray(){
        int[] nums={-2,1,-3,4,-1,2,1,-5,4};
        int maxSub=func.maxSubArray(nums);
        Assert.assertEquals(maxSub,6);
    }

    @Test
    public void testWithOne(){
        int[] nums={1};
        int maxSub=func.maxSubArray(nums);
        Assert.assertEquals(maxSub,1);
    }

    @Test
    public void testNegative(){
        int[] nums={-4,-2,-3,-1,-8,-7,-3};
        int maxSub=func.maxSubArray(nums);
        Assert.assertEquals(maxSub,-1);
    }
}
