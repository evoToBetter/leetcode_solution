package evotobetter.leetcode.test.solution90;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class SubSetsII90Test {
    private SubSetsII90 func;

    @BeforeClass
    public void setup(){
        func=new SubSetsII90_1();
    }

    @Test
    public void testSubsetsWithDup(){
        int[] nums={1,2,2};
        List<List<Integer>> res=func.subsetsWithDup(nums);
        System.out.println(res);
    }
}