package leetcode.Tree;

import nowcoder.sword.tree.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

/**
 * author:Gert
 */
public class BinaryTreeTraversal {


    /**
     * 二叉树--前序遍历（非递归）
     * @param node
     * @return
     */
    public static TreeNode front(TreeNode node){
        if(node==null){
            return  null;
        }
        Stack<TreeNode> stack=new Stack<TreeNode>();
        while (!stack.isEmpty()||node!=null){
            if(node!=null){
                System.out.println(node.val);
                stack.push(node);
                node=node.left;
            }else {
                node=stack.pop();
                node=node.right;
            }
        }
        return  node;
    }


    /**
     * 二叉树--中序遍历（非递归）
     * @param root
     * @return
     */
    public List<Integer> inorderTraversal(TreeNode root) {
        if (root == null) {
            return Collections.emptyList();
        }
        Stack<TreeNode> stack = new Stack<TreeNode>();
        List<Integer> list = new ArrayList<>();
        while (!stack.isEmpty() || root != null) {
            if (root != null) {
                stack.push(root);
                root = root.left;
            } else {
                root = stack.pop();
                list.add(root.val);
                root = root.right;
            }
        }
        return list;
    }
}
