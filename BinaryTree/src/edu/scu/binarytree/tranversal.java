package edu.scu.binarytree;

import java.util.ArrayList;
import java.util.List;

public class tranversal {
    public static List<Integer> preorderTraversal(TreeNode root) {
        //TreeNode cur = root;
        List<Integer> list = new ArrayList<>();
        PreorderTraversal(root,list);
        return list;
    }
    public static void PreorderTraversal(TreeNode root,List<Integer> list) {
        if (root != null) {
            list.add(root.val);
            PreorderTraversal(root.left, list);
            PreorderTraversal(root.right, list);
        }
    }
    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        InorderTraversal(root,list);
        return list;
    }
    public static void InorderTraversal(TreeNode root,List<Integer> list) {
        if (root != null) {
            InorderTraversal(root.left, list);
            list.add(root.val);
            InorderTraversal(root.right, list);
        }
    }
    public static List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        PostorderTraversal(root,list);
        return list;
    }
    public static void PostorderTraversal(TreeNode root,List<Integer> list) {
        if (root != null) {
            PostorderTraversal(root.left, list);
            PostorderTraversal(root.right, list);
            list.add(root.val);
        }
    }
}
