package leetcode.linkedList;

/**
 * @ProjectName: ALGORITHM
 * @Package: interview.leetcode.linkedList
 * @ClassName: TwoNumAddByLinked
 * @Author: Gert
 * @Description: 2.两数相加
 * @Date: 2019/12/5 0:02
 * @Version: 1.0
 */
public class TwoNumAddByLinked {
    /**
     * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
     * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
     * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
     * 示例：
     * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
     * 输出：7 -> 0 -> 8
     * 原因：342 + 465 = 807
     *
     */
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode node1=l1;
        ListNode node2=l2;
        int carry=0;
        ListNode listNode=new ListNode(0);
        ListNode cur=listNode;
        while (node1!=null ||node2!=null){
              int x=node1!=null?node1.val:0;
              int y=node2!=null?node2.val:0;
              int sum=carry+x+y;
              carry=sum/10;
              cur.next=new ListNode(sum%10);
              cur=cur.next;
              if(node1!=null) node1=node1.next;
              if(node2!=null) node2=node2.next;
        }
        //疑问：为啥cur到最后只剩最后一个值
        if(carry>0){
            cur.next=new ListNode(carry%10);
        }
        return listNode.next;
    }

    public static void main(String[] args) {
        ListNode head=new ListNode(2);
        ListNode node1=new ListNode(4);
        ListNode node2=new ListNode(3);
        head.next=node1;
        node1.next=node2;
        ListNode head2=new ListNode(5);
        ListNode node11=new ListNode(6);
        ListNode node22=new ListNode(4);
        head2.next=node11;
        node11.next=node22;
        TwoNumAddByLinked.addTwoNumbers(head,head2);
    }
}
