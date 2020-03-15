package leetcode.Tree;


import java.util.Arrays;

/**
 * @Author: Gert
 * @Description: 二叉树后序遍历
 */
public class LastSearch {
    /**
     * 题目描述
     * 给定一个二叉树的前序遍历和中序遍历的序列，输出对应这个二叉树的后续遍历序列。
     * 输入描述:
     * 输入为一行。 两个字符串,分别表示二叉树的前序遍历和中序遍历结果,用空格分隔。保证数据合法
     * 输出描述:
     * 对应输出后序遍历序列
     * 示例1
     * 输入
     * 复制
     * ABDEC DBEAC
     * 输出
     * 复制
     * DEBCA
     */
    public  static void  main(String args[]){
        //Scanner sc=new Scanner(System.in);
        //String s=sc.nextLine();
        String s="ABDEC DBEAC";
        String []str=s.split(" ");
        char []pre=str[0].toCharArray();
        char []in=str[1].toCharArray();
        Node node=getTree(pre,in);
        outPutNode(node);
    }




    public static Node getTree(char []pre, char []in){
        if(pre.length==0||in.length==0){
            return  null;
        }
        Node node=new Node(pre[0]);
        for(int i=0;i<in.length;i++){
            if(pre[0]==in[i]){
                node.left=getTree(Arrays.copyOfRange(pre,1,i+1),Arrays.copyOfRange(in,0,i));
                node.right=getTree(Arrays.copyOfRange(pre,i+1,pre.length),Arrays.copyOfRange(in,i+1,in.length));
            }
        }
        return  node;
    }
    public static   void   outPutNode(Node node){
        if(node!=null) {
            outPutNode(node.left);
            outPutNode(node.right);
            System.out.print(node.val);
        }
    }
}

class Node{
    char val;
    Node left;
    Node right;

    public Node(char val) {
        this.val = val;
    }
}
