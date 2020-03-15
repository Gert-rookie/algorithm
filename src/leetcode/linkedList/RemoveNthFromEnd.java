package leetcode.linkedList;

/**
 * @ProjectName: ALGORITHM
 * @Package: interview.leetcode.linkedList
 * @ClassName: RemoveNthFromEnd
 * @Author: Gert
 * @Description: 19. 删除链表的倒数第N个节点
 * @Date: 2019/12/5 22:00
 * @Version: 1.0
 */
public class RemoveNthFromEnd {
    /**
     * 给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。
     *
     * 示例：
     *
     * 给定一个链表: 1->2->3->4->5, 和 n = 2.
     *
     * 当删除了倒数第二个节点后，链表变为 1->2->3->5.
     * 说明：
     *
     * 给定的 n 保证是有效的。
     *
     * 进阶：
     *
     * 你能尝试使用一趟扫描实现吗？
     *
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode node=head;
        int len=0;
        while (node!=null){
            node=node.next;
            len++;

        }
        if(n==len){
            return  head.next;
        }
        node=head;
        int cut=len-n;

        while (cut-->1){
            node=node.next;
        }
        if(node.next!=null){
            node.next=node.next.next;
            return head;
        }
        return null;

    }
}
