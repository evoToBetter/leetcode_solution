package evotobetter.leetcode.solution100;

import evotobetter.leetcode.util.TreeNode;

public class SameTree100_1 implements SameTree100 {
    @Override
    public boolean isSameTree(TreeNode left, TreeNode right) {
        if((left==null&&right!=null)||(left!=null&&right==null)){
            return false;
        }else if(left==null&&right==null){
            return true;
        }else if(left!=null&&right!=null){
            if(left.val==right.val){
                if(isSameTree(left.left,right.left)&&isSameTree(left.right,right.right)){
                    return true;
                }else{
                    return false;
                }
            }else{
                return false;
            }
        }
        return false;
    }
}
