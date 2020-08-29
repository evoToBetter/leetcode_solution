package evotobetter.leetcode.test.solution40;

public class JumpGameII45_1 implements JumpGameII45 {
    //timeout, only need the farest position
    @Override
    public int jump(int[] nums) {
        if(nums.length==1){
            return 0;
        }
        int minStep=jump(0,nums,nums[0]);
        return minStep;
    }

    private int jump(int start, int[] nums, int farest){
        if(nums[start]==0||(start+nums[start]<farest)){
            return Integer.MAX_VALUE;
        }
        if((start+nums[start]>=nums.length-1)){
            return 1;
        }
        int minStep=Integer.MAX_VALUE;
        farest=start+nums[start];
        for(int i=nums[start];i>0;i--){
            int currentStep=jump(start+i,nums, farest);
            minStep=Math.min(minStep,currentStep);
        }
        if(Integer.MAX_VALUE==minStep){
            return minStep;
        }else{
            return minStep+1;
        }
    }
}
