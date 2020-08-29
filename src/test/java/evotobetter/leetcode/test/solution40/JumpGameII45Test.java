package evotobetter.leetcode.test.solution40;

import evotobetter.leetcode.solution40.JumpGameII45;
import evotobetter.leetcode.solution40.JumpGameII45_1;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class JumpGameII45Test {
    private JumpGameII45 func;

    @BeforeClass
    public void setup(){
        func=new JumpGameII45_1();
    }

    @Test
    public void testJump(){
        int[] nums={2,3,1,1,4};
        int minStep=func.jump(nums);
        Assert.assertEquals(minStep,2);
    }

    @Test
    public void testJump1(){
        int[] nums={2,1,3,2,1,1,1};
        int minStep=func.jump(nums);
        System.out.println(minStep);
    }

    @Test
    public void testJump2(){
        int[] nums={2,3,0,1,4};
        int minStep=func.jump(nums);
        System.out.println(minStep);
    }

    @Test
    public void testJump3(){
        int[] nums={5,6,4,4,6,9,4,4,7,4,4,8,2,6,8,1,5,9,6,5,2,7,9,7,9,6,9,4,1,6,8,8,4,4,2,0,3,8,5};
        int minStep=func.jump(nums);
        System.out.println(minStep);
    }

    @Test
    public void testJump4(){
        int[] nums={3,9,3,0,6,8,4,3,5,2,3,7,3,6,2,4,8,8,0,0,7,8,5,7,7,6,1,7,1,2,9,4,1,4,4,9,3};
        int minStep=func.jump(nums);
        System.out.println(minStep);
    }

    @Test
    public void testJump5(){
        int[] nums={8,2,4,4,4,9,5,2,5,8,8,0,8,6,9,1,1,6,3,5,1,2,6,6,0,4,8,6,0,3,2,8,7,6,5,1,7,0,3,4,8,3,5,9,0,4,0,1,0,5,9,2,0,7,0,2,1,0,8,2,5,1,2,3,9,7,4,7,0,0,1,8,5,6,7,5,1,9,9,3,5,0,7,5};
        int minStep=func.jump(nums);
        System.out.println(minStep);
    }
}
