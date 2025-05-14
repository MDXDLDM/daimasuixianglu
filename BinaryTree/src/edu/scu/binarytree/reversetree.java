package edu.scu.binarytree;

public class reversetree {
    public TreeNode reverseTree(TreeNode root) {
        if(root == null)return root;
        swap(root);
        reverseTree(root.left);
        reverseTree(root.right);
        return root;
    }

    public void swap2(TreeNode t1, TreeNode t2) {
        TreeNode temp = t1;
        t1 = t2;
        t2=temp;
    }//方法错误,与c++swap函数不同，java传递参数实际上只是传递了一个副本，在方法内直接交换局部变量并不能像c++
    //一样，通过引用来改变原对象，但是java可以改变局部变量对应的属性，来实现对源对象的改变，这也是为什么，这里传递
    //的是root节点，而不是传递left和right
    public void swap(TreeNode root) {
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
    }
}
