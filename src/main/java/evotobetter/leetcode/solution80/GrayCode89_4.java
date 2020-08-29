package evotobetter.leetcode.solution80;

import java.util.ArrayList;
import java.util.List;

public class GrayCode89_4 implements GrayCode89 {

    @Override
    public List<Integer> grayCode(int n) {
        List<Integer> result=new ArrayList<>();
        int prev=0;
        for(int i=0; i<1<<n;i++){
            prev^=(i&1)==1?1:(prev&-prev)<<1;
            result.add(prev);
        }
        return result;
    }
}
