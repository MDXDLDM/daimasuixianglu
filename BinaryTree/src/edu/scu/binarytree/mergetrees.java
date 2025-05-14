package edu.scu.binarytree;

public class mergetrees {
    public TreeNode Merge(TreeNode t1, TreeNode t2) {
        if(t1==null&&t2==null){
            return null;
        }//上面是两个节点均为空节点的情况，所以下面判断的时候不需要加上另一个节点不为空的情况
        if(t1==null){
            return t2;
        }
        if(t2==null){
            return t1;
        }
        TreeNode t3 = new TreeNode(t1.val+t2.val);
        t3.left = Merge(t1.left, t2.left);
        t3.right = Merge(t2.right, t1.right);
        return t3;
    }
}
