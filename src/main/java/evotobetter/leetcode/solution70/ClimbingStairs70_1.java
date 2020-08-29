package evotobetter.leetcode.solution70;

public class ClimbingStairs70_1 implements ClimbingStairs70 {
    @Override
    public int climbStairs(int n) {
        if(n<=3){
            return n;
        }
        int count1=2;
        int count2=3;
        for(int i=3;i<n;i++){
            int tmp=count2;
            count2+=count1;
            count1=tmp;
        }
        return count2;
    }
}
