package evotobetter.leetcode.test.solution200;

import evotobetter.leetcode.solution200.CourseSchedule207;
import evotobetter.leetcode.solution200.CourseSchedule207_2;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CourseSechdule207Test {
    private CourseSchedule207 func;

    @BeforeClass
    public void setup(){
        func=new CourseSchedule207_2();
    }

    @Test
    public void testCourseSechdule(){
        int num=2;
//        int[][] courses={{1,0}};
//        boolean result=func.canFinish(num,courses);
//        System.out.println(result);

        int[][] courses1={{1,0},{0,1}};
        boolean result1=func.canFinish(num,courses1);
        System.out.println(result1);

//        int[][] courses2={{1,0}};
//        boolean result2=func.canFinish(num,courses2);
//        System.out.println(result2);

    }

    @Test
    public void testCourseSechdule1(){
        int num=8;
        int[][] courses={{1,0},{2,6},{1,7},{6,4},{7,0},{0,5}};
        boolean result=func.canFinish(num,courses);
        System.out.println(result);

    }

    @Test
    public void testCourseSechdule2(){
        int num=7;
        int[][] courses={{1,0},{0,3},{0,2},{3,2},{2,5},{4,5},{5,6},{2,4}};
        boolean result=func.canFinish(num,courses);
        System.out.println(result);

    }
}
