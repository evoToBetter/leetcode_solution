package evotobetter.leetcode.test.solution90;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubSetsII90_2 implements SubSetsII90 {
    // dfs method
    @Override
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        if(nums==null||nums.length==0){
            return new ArrayList<>();
        }
        Arrays.sort(nums);
        List<List<Integer>> res= new ArrayList<>();
        dfs(res,new ArrayList<>(), nums, 0);
        return res;
    }

    private void dfs(List<List<Integer>> res, List<Integer> out, int[] nums, int idx){
        if(idx>=nums.length){
            res.add(new ArrayList<>(out));
        }else{
            out.add(nums[idx]);
            dfs(res,out,nums,idx+1);
            out.remove(out.size()-1);
            while(idx+1<nums.length && nums[idx]==nums[idx+1]){
                idx++;
            }
            dfs(res,out,nums,idx+1);
        }
    }
}
