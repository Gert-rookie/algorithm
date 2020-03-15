package niuke.sword.tree;

import java.util.*;

/**
 * @Author: Gert
 * @Description: 按之字形顺序打印二叉树
 */
public class PrintTree {
    /**
     * 题目描述
     * 请实现一个函数按照之字形打印二叉树，即第一行按照从左到右的顺序打印，第二层按照从右至左的顺序打印，第三行按照从左到右的顺序打印，其他行以此类推。
     */
    public static void main(String[] args) {
        int []pre={8,6,5,7,10,9,11}; //前序遍历
        int []in={5,6,7,8,9,10,11};  //中序遍历

        RebuildTree tree=new RebuildTree();
        TreeNode node=tree.reConstructBinaryTree(pre,in);
        ArrayList<ArrayList<Integer>> list= PrintTree.Print(node);
        for(ArrayList<Integer> list1 :list){
            System.out.println(Arrays.asList(list1));
        }


    }
    public static ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>>  arrayLists=new  ArrayList<ArrayList<Integer>>();
         if(pRoot==null){
             return arrayLists;
         }
        Queue<TreeNode>  queue=new LinkedList<>();
         queue.add(pRoot);
         int res=0;
         while (!queue.isEmpty()){
              int n=queue.size();
              ArrayList<Integer>  list=new ArrayList<>();
              for(int i=0;i<n;i++){
                  TreeNode curNode=queue.poll();
                  list.add(curNode.val);
                  if(curNode.left!=null){
                      queue.add(curNode.left);
                  }
                  if(curNode.right!=null){
                      queue.add(curNode.right);
                  }
              }
              res++;
              if(res%2==0){
                  Collections.reverse(list);
              }
              arrayLists.add(list);
         }
         return  arrayLists;
    }



}
