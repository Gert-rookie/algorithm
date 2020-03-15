package niuke.sword.recursion;

/**
 * @ProjectName: ALGORITHM
 * @Package: interview.sword.recursion
 * @ClassName: Jumping_stairs
 * @Author: Gert
 * @Description: 跳台阶
 * @Date: 2019/9/1 12:07
 * @Version: 1.0
 */

/**
 *一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法（先后次序不同算不同的结果）。
 */
public class Jumping_stairs {
    /**
     * 答题思路
     * 如果只有1级台阶，那显然只有一种跳法
     * 如果有2级台阶，那么就有2种跳法，一种是分2次跳。每次跳1级，另一种就是一次跳2级
     * 如果台阶级数大于2，设为n的话，这时我们把n级台阶时的跳法看成n的函数，记为f(n),第一次跳的时候有2种不同的选择：一是第一次跳一级，此时跳法的数目等于后面剩下的n-1级台阶的跳法数目，即为f(n-1),二是第一次跳二级，此时跳法的数目等于后面剩下的n-2级台阶的跳法数目，即为f(n-2),因此n级台阶的不同跳法的总数为f(n) = f(n-1) + f(n-2)，不难看出就是斐波那契数列
     * @param target
     * @return
     */
    public int JumpFloor(int target) {
        if(target<=2){
            return target;
        }
        return  JumpFloor(target-1)+JumpFloor(target-2);
    }


    /**
     * 若把条件修改成一次可以跳一级，也可以跳2级...也可以跳上n级呢？
     * @param target
     * @return
     */


    /**
     * todo 思路
     * 如果台阶级数为n的话，这时我们把n级台阶时的跳法看成n的函数，记为f(n),第一次跳的时候有n种不同的选择：若是第一次跳一级，此时跳法的数目等于后面剩下的n-1级台阶的跳法数目，即为f(n-1),若是第一次跳m(m<n)级，此时跳法的数目等于后面剩下的n-m级台阶的跳法数目，即为f(n-m),若是第一次跳n级，此时跳法的数目等于1.所以 f(n) = f(n-1) + f(n-2) + ... + f(n-m) + ... + f(2) + f(1) + 1
     * 因此f(n - 1) = f(n-2) + ... + f(n-m) + ... + f(2) + f(1) + 1
     * 两式相减得到 f(n) = 2 * f(n-1)
     * 因此可以得到下面的结果
     * \begin{aligned} f(n) &= f(n-1) + f(n-2) + ... + f(n-m) + ... + f(2) + f(1) + 1 \\ &= 1 + f(1) + f(2) + ... + f(n-m) + ... + f(n-2) + f(n-1) \\ &= 1 + f(1) + 2*f(1) + ... + 2^{n-m-1} * f(1) + ... 2^{n-3} * f(1) + 2^{n-2} * f(1) \\ &= 1 + 1 + 21 + ... + 2^{n-m-1} + ... 2^{n-3} + 2^{n-2} \\ &= 2^{n-1} \end{aligned}
     * 答案
     * 若把条件修改成一次可以跳一级，也可以跳2级...也可以跳上n级呢，则f(n) = 2^{n-1}
     * @param target
     * @return
     */
    public int JumpFloorII(int target) {
         return 1<<target-1;  //位运算，箭头向左相当于乘以2，向右相当于除以2
    }

}
