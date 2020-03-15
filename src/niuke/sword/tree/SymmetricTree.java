package niuke.sword.tree;

/**
 * @Author: Gert
 * @Description: 对称的二叉树
 */
public class SymmetricTree {
    /**
     * 题目描述
     * 请实现一个函数，用来判断一颗二叉树是不是对称的。注意，如果一个二叉树同此二叉树的镜像是同样的，定义其为对称的。
     */
    public static void main(String[] args) {
        int []pre=new int[]{8,6,5,7,6,7};
        int []in=new int[]{5,6,7,8,7,6};
        RebuildTree rebuildTree=new RebuildTree();
        TreeNode node=rebuildTree.reConstructBinaryTree(pre,in);
        SymmetricTree symmetricTree=new SymmetricTree();
        boolean s=symmetricTree.isSymmetrical(node);
        System.out.println(s);
    }


   public   boolean isSymmetrical(TreeNode pRoot)
    {
        return  pRoot==null||judge(pRoot.left,pRoot.right);

    }
    public boolean judge(TreeNode node,TreeNode pRoot){
        if(node==null&&pRoot==null){
            return  true;
        }else if(node==null||pRoot==null){
            return  false;
        }
        if(node.val!=pRoot.val){
            return false;
        }else {
            return  judge(node.left,pRoot.right)&&judge(node.right,pRoot.left);
        }


    }

}
