package leetcode.Tree;



import nowcoder.sword.tree.RebuildTree;
import nowcoder.sword.tree.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Author: Gert
 * @Description: 二叉树的深度
 */
public class MaxDepth {
    /**
     * 输入一棵二叉树的根节点，求该树的深度。从根节点到叶节点依次经过的节点（含根、叶节点）形成树的一条路径，最长路径的长度为树的深度。
     * 例如：
     *
     * 给定二叉树 [3,9,20,null,null,15,7]，
     *
     *     3
     *    / \
     *   9  20
     *     /  \
     *    15   7
     * 返回它的最大深度 3 。
     *
     *
     */
    public static void main(String[] args) {
          int []pre=new int[]{3,9,20,15,7};
          int []in=new int[]{9,3,15,20,7};
        RebuildTree rebuildTree=new RebuildTree();
       TreeNode treeNode= rebuildTree.reConstructBinaryTree(pre,in);
      //int a= MaxDepth.maxDepths(treeNode);
        int a= MaxDepth.maxDepthss(treeNode);
        System.out.println(a);

    }

    //递归法
    public static int maxDepths(TreeNode root) {
        if (root == null) {
            return 0;
        }
        System.out.println(root.getVal());
        int b= Math.max(maxDepths(root.left), maxDepths(root.right)) + 1;
        System.out.println("b="+b);
        return b;
    }

    //层次遍历法
    public  static  int maxDepthss(TreeNode root){
        int res=0;
        if(root==null){
             return  res;
         }
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            int n=queue.size();
            for(int  i=0;i<n;i++){
                TreeNode  curNode=queue.poll();
                if(curNode.left!=null){
                    queue.add(curNode.left);
                }
                if(curNode.right!=null){
                    queue.add(curNode.right);
                }
            }
            res++;
        }
        return res;
    }
}
