package evotobetter.leetcode.solution60;

public class SqrtX69_1 implements SqrtX69 {
    @Override
    public int mySqrt(int x) {
        if(x<=1){
            return x;
        }
        long left=1;
        long right=x;
        while(left<right){
            long mid=left+(right-left)/2;
            long pow2=mid*mid;
            if(pow2==(long)x){
                return (int)mid;
            }
            if(pow2>(long)x){
                right=mid;
            }
            if(pow2<(long)x){
                left=mid+1;
            }
        }
        return (int)left-1;
    }
}
