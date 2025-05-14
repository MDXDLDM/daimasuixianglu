package edu.scu.binarytree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Nlevelorder {
    public static List<List<Integer>> NLevelOrder(Node root) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        Queue<Node> queue = new LinkedList<Node>();
        if (root == null) return result;
        queue.add(root);
        while (!queue.isEmpty()) {
            int length = queue.size();
            List<Integer> list=new ArrayList<>();
            while(length>0){
                Node node = queue.poll();
                if (node.children!=null) {
                    for(int i=0;i<node.children.size();i++){
                        queue.add(node.children.get(i));
                    }
                }
                list.add(node.val);
                length--;
            }
            result.add(list);
        }
        return result;
    }
}
