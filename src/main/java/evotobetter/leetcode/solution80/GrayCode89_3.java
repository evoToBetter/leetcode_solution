package evotobetter.leetcode.solution80;

import java.util.ArrayList;
import java.util.List;

public class GrayCode89_3 implements GrayCode89 {
    /*
        generate sequence by XOR
        0 ms, 37.1MB
     */
    @Override
    public List<Integer> grayCode(int n) {
        List<Integer> result=new ArrayList<>();
        for(int i=0;i<1<<n;i++){
            result.add(i^(i>>1));
        }
        return result;
    }
}
