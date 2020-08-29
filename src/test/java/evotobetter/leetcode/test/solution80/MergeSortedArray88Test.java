package evotobetter.leetcode.test.solution80;

import evotobetter.leetcode.solution80.MergeSortedArray88;
import evotobetter.leetcode.solution80.MergeSortedArray88_1;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.Arrays;

public class MergeSortedArray88Test {
    private MergeSortedArray88 func;

    @BeforeClass
    public void setup(){
        func=new MergeSortedArray88_1();
    }

    @Test
    public void testMerge(){
        int[] nums1={1,2,7,0,0,0};
        int[] nums2={2,3,6};
        func.merge(nums1,3,nums2,nums2.length);
        System.out.println(Arrays.toString(nums1));
    }

}
