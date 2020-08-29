package evotobetter.leetcode.test.solution90;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.lang.Integer;

public class SubSetsII90_1 implements SubSetsII90 {
    @Override
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        Arrays.sort(nums);
        backtrack(0,nums,res,new ArrayList<>());
        return res;
    }
    private void backtrack(int start,int[] nums,List<List<Integer>> res,List<Integer> preList){
        res.add(new ArrayList<>(preList));
        if(start>=nums.length){
            return;
        }
        for(int i= start;i<nums.length;i++){
            if(i!=start&&nums[i]==nums[i-1]){
                continue;
            }
            preList.add(nums[i]);
            backtrack(i+1,nums,res,preList);
            preList.remove(preList.size()-1);
        }
    }

}
