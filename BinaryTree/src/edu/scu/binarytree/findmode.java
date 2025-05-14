package edu.scu.binarytree;

import java.util.ArrayList;
import java.util.Stack;

public class findmode {
    ArrayList<Integer> res=new ArrayList<Integer>();
    TreeNode pre;
    int count=0;
    int maxcount=0;
    public int[] findMode(TreeNode root) {
        getnums(root);
        int[] nums=new int[res.size()];
        for(int i=0;i<res.size();i++){
            nums[i]=res.get(i);
        }
        return nums;
    }
    public void getnums(TreeNode root) {
        if(root==null)return;
        Stack<TreeNode> stack=new Stack<TreeNode>();
        while(!stack.isEmpty()||root!=null){
            if(root!=null){
                stack.push(root);
                root=root.left;
            }
            else{
                root=stack.pop();
                if(pre==null||pre.val!=root.val){
                    count=1;
                }else{
                    count++;
                }
                if(count>maxcount){
                    res.clear();
                    maxcount=count;
                    res.add(root.val);
                }else if(count==maxcount){
                    res.add(root.val);
                }
                pre=root;
                root=root.right;
            }
        }
    }//下面使用递归
    public int[] findMode2(TreeNode root) {
        getnums2(root);
        int[] nums=new int[res.size()];
        for(int i=0;i<res.size();i++){
            nums[i]=res.get(i);
        }
        return nums;
    }
    public void getnums2(TreeNode root) {
        if(root==null)return;
        if(root.left!=null){
            getnums2(root.left);
        }
        if(pre==null||pre.val!=root.val){
            count=1;
        }else{
            count++;
        }
        if(count>maxcount){
            res.clear();
            maxcount=count;
            res.add(root.val);
        }else if(count==maxcount){
            res.add(root.val);
        }
        pre=root;
        getnums2(root.right);
    }
}
