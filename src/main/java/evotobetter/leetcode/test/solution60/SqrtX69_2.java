package evotobetter.leetcode.test.solution60;

public class SqrtX69_2 implements SqrtX69 {
    @Override
    public int mySqrt(int x) {
        if(x<=1){
            return x;
        }
        double c=x,x0=x;
        while(true){
            double x1=0.5*(x0+c/x0);
            if(Math.abs(x1-x0)<=1e-7){
                break;
            }
            x0=x1;
        }
        return (int)x0;
    }
}
