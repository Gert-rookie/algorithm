package nowcoder.sword.tree;

/**
 * @Author: Gert
 * @Description: 二叉树的下一个结点
 */
public class GetNextNode {
    public TreeLinkNode GetNext(TreeLinkNode pNode){
        //当前节点的右节点存在
        if(pNode.right!=null){
            TreeLinkNode treeNode=pNode.right;
            while(treeNode.left!=null){
                treeNode=treeNode.left;
            }
            return treeNode;
        }else{
            //其父节点一定是下一个节点
            while(pNode.next!=null){
                TreeLinkNode  parent=pNode.next;
                if(parent.left==pNode){
                    return parent;
                }
                pNode=pNode.next;
            }

        }
        return null;

    }
}


class TreeLinkNode{
     int val;
    TreeLinkNode  left;
    TreeLinkNode right;
    TreeLinkNode  next;  //指向父类
      public TreeLinkNode(int val){
          this.val=val;
      }
}
