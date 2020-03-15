package niuke.sword.tree;

import java.util.Arrays;

/**
 * @ProjectName: ALGORITHM
 * @Package: interview.sword.tree
 * @ClassName: RebuildTree
 * @Author:  Gert
 * @Description: 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树
 * @Date: 2019/7/4 10:04
 * @Version: 1.0
 */
public class RebuildTree {
    /**
     * 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。假设输入的前序遍历和中序遍历的结果中都不含重复的数字。例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。
     * 后序遍历为{7	4	2	5	8	6	3	1}
     */

    //解法一
    public  TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        if(pre.length==0||in.length==0){
            return null;
        }
        TreeNode node=new TreeNode(pre[0]);
        for (int i=0;i<in.length;i++){
             if(pre[0]==in[i]){
                 node.left=reConstructBinaryTree(Arrays.copyOfRange(pre,1,i+1),Arrays.copyOfRange(in,0,i));
                 node.right=reConstructBinaryTree(Arrays.copyOfRange(pre,i+1,pre.length),Arrays.copyOfRange(in,i+1,in.length));
             }
        }
        return node;

    }

    /**
     * 前序遍历  根左右
     * @param node
     */
    public void preOrder(TreeNode node){
        if(null!=node){
            System.out.print(node.getVal()+"\t");
            preOrder(node.getLeft());
            preOrder(node.getRight());
        }
    }

    /**
     * 中序遍历采用递归的方式   左中右
     * @param node
     */

     public void inOrder(TreeNode node){
        if(node!=null){
            inOrder(node.getLeft());
            System.out.print(node.getVal()+"\t");
            inOrder(node.getRight());
        }
    }

    /**
     * 后序遍历  左右根
     * @param node
     */
    public void postOrder(TreeNode node){
        if(node!=null){
            postOrder(node.getLeft());
            postOrder(node.getRight());
            System.out.print(node.getVal()+"\t");

        }
    }


    public static void main(String[] args) {
         int []pre={1,2,4,7,3,5,6,8};
         int []in={4,7,2,1,5,3,8,6};

         RebuildTree tree=new RebuildTree();
       TreeNode node=tree.reConstructBinaryTree(pre,in);
        //前序遍历递归的方式
             //tree.preOrder(node);
        //中序遍历递归的方式
             //tree.inOrder(node);
        //后序遍历递归的方式
            tree.postOrder(node);


    }
}
