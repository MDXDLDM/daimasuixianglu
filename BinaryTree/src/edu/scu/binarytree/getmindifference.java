package edu.scu.binarytree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class getmindifference {
    public int getMinDiff(TreeNode root) {
        //List<Integer> list = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        //stack.push(root);
        TreeNode cur=root;
        TreeNode prev=null;
        int res=Integer.MAX_VALUE;
        while(!stack.isEmpty()||cur!=null) {
            if(cur!=null) {
                stack.push(cur);
                cur=cur.left;
            }
            else{
                cur=stack.pop();
                if(prev!=null) {
                    res=Math.min(res,cur.val-prev.val);
                }
                //list.add(cur.val);
                prev=cur;
                cur=cur.right;
            }
        }
        return res;
    }
    //下面使用递归
    TreeNode pre=null;
    int min=Integer.MAX_VALUE;
    public int getMinDiff2(TreeNode root) {
        if(root==null) return 0;
        cal(root);
        return min;
    }
    public void cal(TreeNode root) {
        if(root==null) {return;}
        cal(root.left);
        if(pre!=null) {
            min=Math.min(min,root.val-pre.val);
        }
        pre=root;
        cal(root.right);
    }

}
