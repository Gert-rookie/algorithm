package nowcoder.sword.linkedList;

import java.util.ArrayList;

/**
 * @ProjectName: ALGORITHM
 * @Package: interview.sword.linkedList
 * @ClassName: PrintList
 * @Author:  Gert
 * @Description: 输入一个链表，按链表值从尾到头的顺序返回一个ArrayList。
 * @Date: 2019/7/4 0:32
 * @Version: 1.0
 */
public class PrintList {
    /**
     * 用一个链表
     * @param listNode
     * @return
     */
    public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> list=new ArrayList<>();
             if(listNode==null){
                   return list;
          }
            while (listNode!=null){

                 list.add(listNode.val);
                 listNode=listNode.next;
            }

            for (int i=0,j=list.size()-1;i<list.size()&&j>=0;i++,j--){
                //判定条件必须写在前面
                    if(i>=j){
                    break;
                   }
                    //get不能越界，add索引值可以写到当前最后一个索引加一
                    //两两交换，第一个和最后一个交换，倒数第二个和第二个，以此类推
                      int temp=list.get(i);
                      list.remove(i);   //移除后数组长度减一
                      list.add(i,list.get(j-1));
                      list.remove(j);
                      list.add(j,temp);

            }
            for(int i=0;i<list.size();i++){
                System.out.println(list.get(i));
            }
            return list;
    }

    /**
     * 利用两个数组
     * @param listNode
     * @return
     */
    public ArrayList<Integer> printListFromTailToHeads(ListNode listNode) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> result = new ArrayList<Integer>();
        ListNode temp = listNode;
        while ( temp != null ) {
            list.add( temp.val );
            temp = temp.next;
        }
        for ( int i = list.size()-1; i>=0; i-- ) {
            result.add( list.get(i) );
        }
        return result;
    }

    /**
     * 解法三，利用递归压栈，往回走
     */
    ArrayList<Integer> list=new ArrayList<Integer>();
    public ArrayList<Integer> printListFromTailToHeadss(ListNode listNode) {
        if(listNode!=null){
            printListFromTailToHead(listNode.next);
            list.add(listNode.val);
        }
        return list;
    }





    public static void main(String[] args) {
        ListNode listNode1=new ListNode(67);
        ListNode listNode2=new ListNode(0);
        ListNode listNode3=new ListNode(24);
        ListNode listNode4=new ListNode(58);
       // ListNode listNode5=new ListNode(3);
        listNode1.next=listNode2;
        listNode2.next=listNode3;
        listNode3.next=listNode4;
        //listNode4.setNext(listNode5);
        PrintList.printListFromTailToHead(listNode1);

    }

}
