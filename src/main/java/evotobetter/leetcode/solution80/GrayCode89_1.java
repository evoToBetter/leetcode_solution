package evotobetter.leetcode.solution80;

import java.util.ArrayList;
import java.util.List;

public class GrayCode89_1 implements GrayCode89 {
    /*
        one list for n can be a list expand from list for n-1.
        such as:
        n=2
        list is [0,1,3,2]
        it is in binary: [00,01,11,10]
        and for n=3
        it can be: [000,001,011,010,110,111,101,100]
        the first two of n=3 (000,001) can be archived
        by move left 1 position for first of n=2 (00),
        and then add 0 and 1 to it.
        Then we can get 00+0 and 00+1.
        It also works for other number.
     */
    @Override
    public List<Integer> grayCode(int n) {
        List<Integer> result=new ArrayList<>();
        if(n==0){
            result.add(0);
            return result;
        }
        if(n==1){
            result.add(0);
            result.add(1);
            return result;
        }
        List<Integer> previous=grayCode(n-1);
        for(int i=0; i<previous.size();i++){
            int base=previous.get(i)<<1;
            if((i&1)==0){
                result.add(base);
                result.add(base+1);
            }else{
                result.add(base+1);
                result.add(base);
            }
        }
        return result;
    }
}
