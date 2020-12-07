package nowcoder.sword.linkedList;

/**
 * @author Gert
 * @date 12/7/20
 */
public class MergeList {
    /**
     * 输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。
     * 示例1
     * 输入
     * 复制
     * {1,3,5},{2,4,6}
     * 返回值
     * 复制
     * {1,2,3,4,5,6}
     */

    /**
     * 递归解法（自顶向下）
     * @param list1
     * @param list2
     * @return
     */
    public ListNode Merge(ListNode list1,ListNode list2) {
        if(list1==null){
            return  list2;
        }
        if(list2==null){
            return  list1;
        }
        ListNode head=null;
        if(list1.val<list2.val){
            head=list1;
            head.next=Merge(list1.next,list2);
        }else{
            head=list2;
            head.next=Merge(list1,list2.next);
        }
        return head;
    }



}
