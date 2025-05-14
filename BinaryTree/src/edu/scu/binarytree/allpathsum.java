package edu.scu.binarytree;

import java.util.ArrayList;
import java.util.List;

public class allpathsum {
    public List<List<Integer>> pathSum(TreeNode root,int sum) {
        List<List<Integer>> allpaths=new ArrayList<List<Integer>>();
        List<Integer> path=new ArrayList<Integer>();
        getpaths(root,sum,path,allpaths);
        return allpaths;
    }
    public void getpaths(TreeNode root,int sum,List<Integer> path,List<List<Integer>> allpaths) {
        if(root==null)return;
        path.add(root.val);
        if(root.left==null && root.right==null&&sum==root.val){
            allpaths.add(new ArrayList<>(path));
            return;
        }
        if(root.left!=null){
            getpaths(root.left,sum-root.val,path,allpaths);
            path.remove(path.size()-1);
        }
        if(root.right!=null){
            getpaths(root.right,sum-root.val,path,allpaths);
            path.remove(path.size()-1);
        }
    }
}
