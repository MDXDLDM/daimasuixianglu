package edu.scu.binarytree;

import java.util.ArrayList;
import java.util.List;

public class paths {
    public static List<String> Paths(TreeNode root) {
        //StringBuilder res=new StringBuilder();
        List<Integer> list = new ArrayList<>();
        List<String> paths = new ArrayList<String>();
        if(root == null)return paths;
        getpathstring(root,list,paths);
        return paths;
    }

    public static void getpathstring(TreeNode root,List<Integer>res,List<String> paths){
        res.add(root.val);
        if(root.left == null && root.right == null){
            StringBuilder sb=new StringBuilder();
            for(int i=0;i<res.size()-1;i++){
                sb.append(res.get(i)).append("->");
            }
            sb.append(res.get(res.size()-1));
            paths.add(sb.toString());
            return;
        }
        if (root.left != null) {
            getpathstring(root.left,res,paths);
            res.remove(res.size()-1);
        }
        if (root.right != null) {
            getpathstring(root.right,res,paths);
            res.remove(res.size()-1);
        }
    }
}
