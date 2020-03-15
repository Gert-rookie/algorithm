package niuke.sword.linkedList;

/**
 * @Author: Gert
 * @Description: 链表中环的入口结点
 */
public class EntryNodeOfLoop {
    /**
     * 给一个链表，若其中包含环，请找出该链表的环的入口结点，否则，输出null。
     */
    public ListNode EntryNodeOfLoop(ListNode pHead) {
        if(pHead==null||pHead.next==null){
            return null;
        }
       ListNode slow,fast;
        slow=fast=pHead;
        while (slow!=null&&fast.next!=null){
                slow=slow.next;
                fast=fast.next.next;
                if(slow==fast){
                    break;
                }
        }
        if(slow==null&&fast.next==null){

            return null;
        }
            ListNode node1=pHead;
            ListNode node2=slow;
            while (node1!=node2){
                node1=node1.next;
                node2=node2.next;
            }

        return  node1;
    }
}
