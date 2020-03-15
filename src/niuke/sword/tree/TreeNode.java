package niuke.sword.tree;

/**
 * @ProjectName: ALGORITHM
 * @Package: interview.sword.tree
 * @ClassName: TreeNode
 * @Author: jake
 * @Description: 树节点
 * @Date: 2019/7/5 0:10
 * @Version: 1.0
 */
public class TreeNode {
  public   int val;
   public TreeNode left;
   public TreeNode right;
    public TreeNode(int x) { val = x; }

    public int getVal() {
        return val;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }
}

