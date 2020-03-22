package nowcoder.sword.tree;

/**
 * @ProjectName: ALGORITHM
 * @Package: interview.sword.tree
 * @ClassName: MirrorTree
 * @Author:  Gert
 * @Description: 操作给定的二叉树，将其变换为源二叉树的镜像
 * @Date: 2019/7/5 0:06
 * @Version: 1.0
 */
public class MirrorTree {
    public void Mirror(TreeNode root) {
        tree(root);

    }
    public  TreeNode  tree(TreeNode root){
        if(root==null){
            return null;
        }
        TreeNode node=new TreeNode(root.val);
        node.left=tree(root.getRight());
       node.right= tree(root.getLeft());
        return node;
    }

    public static void main(String[] args) {
        int []pre={8,6,5,7,10,9,11}; //前序遍历
        int []in={5,6,7,8,9,10,11};  //中序遍历

        RebuildTree tree=new RebuildTree();
        TreeNode node=tree.reConstructBinaryTree(pre,in);
        MirrorTree mirrorTree=new MirrorTree();
        TreeNode a=   mirrorTree.tree(node); //二叉树镜像反转
        tree.preOrder(a);
        System.out.println();
        tree.inOrder(a);

    }
}
