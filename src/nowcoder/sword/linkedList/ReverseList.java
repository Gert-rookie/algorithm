package nowcoder.sword.linkedList;

/**
 * @Author: Gert
 * @Description: 反转链表
 */
public class ReverseList {
    /**
     * 题目描述
     * 输入一个链表，反转链表后，输出新链表的表头。
     */

    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode preNode = null;
        ListNode rHead = null;
        ListNode curNode = head;
        while (curNode != null) {

            ListNode nextNode = curNode.next;
            if (nextNode == null) {
                rHead = curNode;
            }

            curNode.next = preNode;
            //重新赋值
            preNode = curNode;
            curNode = nextNode;

        }
        return rHead;
    }

}
