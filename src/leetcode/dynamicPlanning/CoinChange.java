package leetcode.dynamicPlanning;

/**
 * @Author: Gert
 * @Description: 322.零钱兑换
 */
public class CoinChange {
    /**
     * 给定不同面额的硬币 coins 和一个总金额 amount。编写一个函数来计算可以凑成总金额所需的最少的硬币个数。如果没有任何一种硬币组合能组成总金额，返回 -1。
     *
     * 示例 1:
     *
     * 输入: coins = [1, 2, 5], amount = 11
     * 输出: 3
     * 解释: 11 = 5 + 5 + 1
     * 示例 2:
     *
     * 输入: coins = [2], amount = 3
     * 输出: -1
     * 说明:
     * 你可以认为每种硬币的数量是无限的。
     *
     *
     */

    /**
     * 思路：1.确定状态：最后一步和子问题 ->  f(11)=min(f(11-1)+1,f(11-2)+1,f(11-5)+1),加一是加上减去的硬币本身
     *      2.转移方程 ： f(x)=min(f(x-1)+1,f(x-2)+1,f(x-5)+1)
     *      3.初始条件和边界情况：f[0]=0
     *      4.计算顺序，从f[0]开始计算
     *
     */
    public int coinChange(int[] coins, int amount) {
        int []f=new int[amount+1];
        int n=coins.length;
        f[0]=0;
        //从1到amount
        for(int i=1;i<=amount;i++){
            f[i]=Integer.MAX_VALUE;  //最大值表示无解
           // f(x)=min(f(x-1)+1,f(x-2)+1,f(x-5)+1)
            for(int j=0;j<n;j++){
                if(i>=coins[j]&&f[i-coins[j]]!=Integer.MAX_VALUE){
                    f[i]=Math.min(f[i-coins[j]]+1,f[i]);
                }
            }
            if(f[amount]==Integer.MAX_VALUE){
                return -1;
            }
        }
        return f[amount];
    }
}
