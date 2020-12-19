package nowcoder.sword.code;

import java.util.Stack;

/**
 * @author Gert
 * @date 12/19/20
 * DS:栈的压入、弹出序列
 */
public class IsPopOrder {
    /**
     * 输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个序列是否可能为该栈的弹出顺序。假设压入栈的所有数字均不相等。例如序列1,2,3,4,5是某栈的压入顺序，序列4,5,3,2,1是该压栈序列对应的一个弹出序列，但4,3,5,1,2就不可能是该压栈序列的弹出序列。（注意：这两个序列的长度是相等的）
     * 示例1
     * 输入
     * 复制
     * [1,2,3,4,5],[4,3,5,1,2]
     * 返回值
     * 复制
     * false
     */

    public boolean isPopOrder(int[] pushA, int[] popA) {
        int n = pushA.length;
        if (n == 0 || pushA == null || popA == null) {
            return false;
        }
        //如果所有的数字都压入栈了仍然没有找到下一个弹出的数字，那么该序列不可能是一个弹出序列。
        Stack<Integer> stack = new Stack<>();
        //用于标识弹出序列位置
        int popIndex = 0;
        for (int i = 0; i < pushA.length; i++) {
            stack.push(pushA[i]);
            while (!stack.empty() && stack.peek() == popA[popIndex]) {
                stack.pop();
                //弹出序列向后一位
                popIndex++;
            }
        }
        return stack.empty();


    }
}
