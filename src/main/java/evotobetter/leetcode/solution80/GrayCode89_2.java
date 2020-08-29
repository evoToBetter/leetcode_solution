package evotobetter.leetcode.test.solution80;

import java.util.ArrayList;
import java.util.List;

public class GrayCode89_2 implements GrayCode89 {
    /*
        list for n = list for n-1 + (reverse list for n-1 with highest position to be 1)
     */
    @Override
    public List<Integer> grayCode(int n) {
        List<Integer> result=new ArrayList<>();
        result.add(0);
        for(int mask=0; mask<n;mask++){
            for(int prev=result.size()-1;prev>=0;prev--){
                result.add((1<<mask)|result.get(prev));
            }
        }
        return result;
    }
}
