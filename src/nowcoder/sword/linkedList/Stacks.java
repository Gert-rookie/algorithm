package nowcoder.sword.linkedList;

import java.util.Stack;

/**
 * @ProjectName: ALGORITHM
 * @Package: interview.sword.linkedList
 * @ClassName: Stacks
 * @Author:  Gert
 * @Description: 用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型
 * @Date: 2019/7/4 15:33
 * @Version: 1.0
 */

public class Stacks {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {

          stack1.push(node);
    }

    public int pop() {
        while (!stack1.empty()){
            stack2.push(stack1.pop());
        }
        //前面把stack1弹出后需要重新压栈
        int a=stack2.pop();
        while (!stack2.empty()){
            stack1.push(stack2.pop());
        }

      return  a;
    }

    public static void main(String[] args) {
        Stacks stacks=new Stacks();
         for (int i=0;i<5;i++){
             stacks.push(i);
         }
        for (int i=0;i<5;i++){
            System.out.println(stacks.pop());
        }

    }
}
