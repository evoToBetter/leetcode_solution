package evotobetter.leetcode.test.solution210;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.Arrays;

public class CourseScheduleII210Test {
    private CourseScheduleII210 func;

    @BeforeClass
    public void setup(){
        func=new CourseScheduleII210_1();
    }

    @Test
    public void courserOrderTest(){
        int[][] prerequistes={{0,1},{1,0}};
        int[] result=func.findOrder(2,prerequistes);
        System.out.println(Arrays.toString(result));
    }
}
