package nowcoder.sword.code;

/**
 * @Author: Gert
 * @Description: 二进制中1的个数
 */
public class NumberOf1s {
    public int NumberOf1(int n) {
        /**
         * 题目描述
         * 输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
         *
         * 思路：
         * n&(n-1)作用：将n的二进制表示中的最低位为1的改为0，先看一个简单的例子：
         * n = 10100(二进制），则(n-1) = 10011 ==》n&(n-1) = 10000
         * 可以看到原本最低位为1的那位变为0。
         */
        int count=0;
        while (n!=0){
            count++;
            n&=(n-1);
        }
        return count;
    }
}
