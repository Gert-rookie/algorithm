package leetcode.interview.Linked;

import java.util.HashMap;

/**
 * @ProjectName: ALGORITHM
 * @Package: interview.leetcode.interview.Linked
 * @ClassName: CopyRandomList
 * @Author: Haoteng.Hong
 * @Description: 复制带随机指针的链表
 * @Date: 2019/10/13 0:14
 * @Version: 1.0
 */
public class CopyRandomList {
    /**
     * 给定一个链表，每个节点包含一个额外增加的随机指针，该指针可以指向链表中的任何节点或空节点。
     *
     * 要求返回这个链表的深拷贝。
     *
     *
     *
     * 示例：
     *
     *
     *
     * 输入：
     * {"$id":"1","next":{"$id":"2","next":null,"random":{"$ref":"2"},"val":2},"random":{"$ref":"2"},"val":1}
     *
     * 解释：
     * 节点 1 的值是 1，它的下一个指针和随机指针都指向节点 2 。
     * 节点 2 的值是 2，它的下一个指针指向 null，随机指针指向它自己。
     *
     */
    public static void main(String[] args) {

    }

    /**
     * 思路分析
     * 这道题其实和 133 题 复制一个图很类似，这里的话就是要解决的问题就是，当更新当前节点的 random 指针的时候，如果 random 指向的是很后边的节点，但此时后边的节点还没有生成，那么我们该如何处理。
     *
     * 和 133 题 一样，我们可以利用 HashMap 将节点提前生成并且保存起来，第二次遍历到他的时候直接从 HashMap 里边拿即可。
     *
     * 这里的话就有两种思路，一种需要遍历两边链表，一种只需要遍历一遍。
     *
     * @param head
     * @return
     */
        public Node copyRandomList(Node head) {
            if(head==null){
                return null;
            }
            Node p=head;
            HashMap<Integer, Node> map=new HashMap<Integer, Node>();
            while(p!=null){
                Node node=new Node();
                node.val=p.val;
                map.put(node.val,node);
                p=p.next;
            }
            p=head;
            while(p!=null){
                if(p.next!=null){
                    map.get(p.val).next=map.get(p.next.val);
                }
                if(p.random!=null){
                    map.get(p.val).random=map.get(p.random.val);
                }
                p=p.next;
            }
            return map.get(head.val);
        }
    }


// Definition for a Node.
class Node {
    public int val;
    public Node next;
    public Node random;

    public Node() {}

    public Node(int _val, Node _next, Node _random) {
        val = _val;
        next = _next;
        random = _random;
    }
};
