package evotobetter.leetcode.test.solution50;

public class MaximumSubarray53_1 implements MaximumSubarray53{
    /*
        If we have a max subarray, it have two situation, one is end at right, another is not.
        maxCurrent save the max of a array end at current right.
        So it only need another one to store the max subarray in current array.
        We compare maxGlobal with maxCurrent every time when array expands to right.
        maxCurrent must one of (right one or current+right one).
        maxGlobal is one of (maxCurrent or old maxGlobal).
     */
    @Override
    public int maxSubArray(int[] nums) {
        int maxGlobal=nums[0];
        int maxCurrent=nums[0];
        for(int i=1; i<nums.length;i++){
            maxCurrent=Math.max(nums[i],maxCurrent+nums[i]);
            if(maxCurrent>maxGlobal){
                maxGlobal=maxCurrent;
            }
        }
        return maxGlobal;
    }
}
