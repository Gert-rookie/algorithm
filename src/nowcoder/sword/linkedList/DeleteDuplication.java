package nowcoder.sword.linkedList;

/**
 * @Author: Gert
 * @Description: 删除链表中重复的结点
 */
public class DeleteDuplication {
    /**
     * 题目描述
     * 在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，重复的结点不保留，返回链表头指针。 例如，链表1->2->3->3->4->4->5 处理后为 1->2->5
     */
    public static void main(String[] args) {
        int []a=new int[]{1,2,3,3,4,4,5};
        DeleteDuplication.createLink(a);
    }
    public ListNode deleteDuplications(ListNode pHead)
    {
        if(pHead==null){
            return null;
        }
        ListNode slow,fast;
        slow=fast=pHead;
        while(slow!=null&&fast.next!=null){
            if(slow.val==fast.next.val){
                slow=slow.next.next;
                fast=slow.next;
            }
            slow=slow.next;
            fast=slow.next;
        }
        return slow;
    }
    public  static  ListNode createLink(int []a){
        ListNode head=new ListNode(a[0]);
        for(int i=1;i<a.length;i++){
            ListNode node=new ListNode(a[i]);
            head.next=node;
            head=head.next;
        }
        return  head;
    }
}
