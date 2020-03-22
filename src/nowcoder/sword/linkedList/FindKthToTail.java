package nowcoder.sword.linkedList;

/**
 * @Author: Gert
 * @Description: 链表中倒数第k个结点
 */
public class FindKthToTail {
    /**
     * 题目描述
     * 输入一个链表，输出该链表中倒数第k个结点。
     */
    public ListNode FindKthToTail(ListNode head,int k) {
        if(head==null){
            return null;
        }
        int length=0;
        ListNode node=head;
        while(node!=null){
            length++;
            node=node.next;
        }
        int count=1;
        while(head!=null){
            if(count==(length-k)+1){
                return head;
            }
            count++;
            head=head.next;
        }
        return null;
    }
}
