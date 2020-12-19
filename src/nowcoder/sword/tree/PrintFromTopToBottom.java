package nowcoder.sword.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Gert
 * @date 12/19/20
 * DS:从上往下打印二叉树
 */
public class PrintFromTopToBottom {

    /**
     * 从上往下打印出二叉树的每个节点，同层节点从左至右打印。
     * @param root
     * @return
     */

    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer>  arr=new ArrayList<>();
        if(root==null){
            return arr;
        }
        //利用队列先进先出的特性
        Queue<TreeNode>  queue=new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode  node=queue.poll();
            arr.add(node.val);
            if(node.left!=null){
                queue.add(node.left);
            }
            if(node.right!=null){
                queue.add(node.right);
            }
        }
        return arr;
    }

}
