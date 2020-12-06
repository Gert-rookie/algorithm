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


    /**
     * 定义快指针和慢指针。
     * 快指针先走 k-1 步，到达第 k 个节点。
     * 然后两指针同时齐步走，当快指针到达末尾时，慢指针在倒数第 k 个节点上。
     * @param head
     * @param k
     * @return
     */
    public ListNode FindKthToTailTwo(ListNode head,int k) {
        if(head==null||k==0){
            return null;
        }
        ListNode slow=head;
        ListNode  fast=head;
        for(int i=0;i<k-1;i++){
            if(fast.next!=null){
                fast=fast.next;
                //无第倒数K个节点
            }else{
                return null;
            }
        }
        //当fast走到链表尾，slow所在节点即为倒数第K个节点
        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        return slow;
    }



}
