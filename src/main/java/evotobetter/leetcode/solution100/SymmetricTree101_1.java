package evotobetter.leetcode.solution100;

import evotobetter.leetcode.util.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class SymmetricTree101_1 implements SymmetricTree101 {
    @Override
    public boolean isSymmetric(TreeNode root) {
        if(root==null){
            return true;
        }
        if((root.left==null&&root.right!=null)||(root.left!=null&&root.right==null)){
            return false;
        }else if(root.left==null && root.right==null){
            return true;
        }else if(root.left!=null&&root.right!=null){
            if(root.left.val==root.right.val){
                List<Integer> leftList=new ArrayList<>();
                treeList(root,true,leftList);
                List<Integer> rightList=new ArrayList<>();
                treeList(root,false,rightList);
                if(leftList.size()!=rightList.size()){
                    return false;
                }
                for(int i=0; i<leftList.size();i++){
                    if(leftList.get(i)!=rightList.get(i)){
                        return false;
                    }
                }
                return true;
            }else{
                return false;
            }
        }
        return true;
    }

    private void treeList(TreeNode root, boolean isLeft, List<Integer> treeList){
        if(root.left==null&&root.right==null){
            treeList.add(null);
            treeList.add(null);
            return;
        }
        TreeNode left=root.left;
        TreeNode right=root.right;
        if(!isLeft){
            TreeNode tmp=left;
            left=right;
            right=tmp;
        }
        if(left==null){
            treeList.add(null);
        }else{
            treeList.add(left.val);
        }
        if(right==null){
            treeList.add(null);
        }else{
            treeList.add(right.val);
        }
        if(left!=null){
            treeList(left,isLeft,treeList);
        }
        if(right!=null){
            treeList(right,isLeft,treeList);
        }
    }
}
