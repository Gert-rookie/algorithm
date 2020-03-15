package leetcode.interview.Linked;

import java.util.HashSet;

/**
 * @ProjectName: ALGORITHM
 * @Package: interview.leetcode.interview.Linked
 * @ClassName: HasCycle
 * @Author: Haoteng.Hong
 * @Description: 141. 环形链表
 * @Date: 2019/10/13 18:56
 * @Version: 1.0
 */
public class HasCycle {
    /**
     * 给定一个链表，判断链表中是否有环。
     *
     * 为了表示给定链表中的环，我们使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。 如果 pos 是 -1，则在该链表中没有环。
     *
     *  
     *
     * 示例 1：
     *
     * 输入：head = [3,2,0,-4], pos = 1
     * 输出：true
     * 解释：链表中有一个环，其尾部连接到第二个节点。
     *
     *
     */
    public boolean hasCycle(ListNode head) {

        HashSet<ListNode>  set=new HashSet<>();
        while(head!=null){
            if(set.contains(head)){
                return true;
            }else{
                set.add(head);
            }
            head=head.next;
        }
        return false;
    }
}

// Definition for singly-linked list.
 class ListNode {
     int val;
     ListNode next;
     ListNode(int x) {
         val = x;
         next = null;
     }
 }
