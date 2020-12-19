package nowcoder.sword.code;

import java.util.Stack;

/**
 * @author Gert
 * @date 12/19/20
 */
public class StackSolution {

    /**
     * 定义栈的数据结构，请在该类型中实现一个能够得到栈中所含最小元素的min函数（时间复杂度应为O（1））。
     */


    /**
     * 方式一：每往栈中压入一个数，则往辅助栈中压入当前最小的值
     */
    Stack<Integer> stack = new Stack<>();
    Stack<Integer> helpStack = new Stack<>();

    public void push(int node) {
        stack.push(node);
        if (helpStack.empty() || node < helpStack.peek()) {
            helpStack.push(node);
        } else {
            helpStack.push(helpStack.peek());
        }

    }

    public void pop() {
        if (!stack.empty() && !helpStack.empty()) {

            helpStack.pop();

            stack.pop();
        }
    }

    public int top() {

        return stack.peek();
    }

    public int min() {

        return helpStack.peek();
    }
}
