package evotobetter.leetcode.test.solution40;

public class JumpGameII45_2 implements JumpGameII45 {
    /*
        get current max position we can reach before i move over it,
        and record max position jump form i.
        when i over last max end, max end become current max jump position.
     */
    @Override
    public int jump(int[] nums) {
        int ans=0;
        int max=nums[0];
        int end=0;
        int n=nums.length;
        for(int i=0; i<n;i++){
            if(i>end){
                ans++;
                end=max;
            }
            max=Math.max(max,i+nums[i]);
        }
        return ans;
    }
}
