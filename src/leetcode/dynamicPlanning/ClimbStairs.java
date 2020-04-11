package leetcode.dynamicPlanning;

/**
 * @Author: Gert
 * @Description: 70. 爬楼梯
 */
public class ClimbStairs {
    /**
     * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
     *
     * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
     *
     * 注意：给定 n 是一个正整数。
     *
     * 示例 1：
     *
     * 输入： 2
     * 输出： 2
     * 解释： 有两种方法可以爬到楼顶。
     * 1.  1 阶 + 1 阶
     * 2.  2 阶
     * 示例 2：
     *
     * 输入： 3
     * 输出： 3
     * 解释： 有三种方法可以爬到楼顶。
     * 1.  1 阶 + 1 阶 + 1 阶
     * 2.  1 阶 + 2 阶
     * 3.  2 阶 + 1 阶
     *
     */
    public static void main(String[] args) {
        ClimbStairs climbStairs=new ClimbStairs();
        int n=7;
        int []memo=new int[n];
        //int a=climbStairs.climbStairss(10);
        int a=climbStairs.climbStairs_one(0,n);
        //int a=climbStairs.climbStairs_two(0,n,memo);
        System.out.println(a);


    }
    //方法1
    public   int climbStairss(int n) {
        if(n==1||n==2){
            return n;
        }
        return    climbStairss(n-1)+climbStairss(n-2);
    }
    //方法2
    //时间复杂度：O(2^n)，树形递归的大小为 2^n

    public   int climbStairs_one(int i,int n) {
       if(i>n){
         return 0;
       }
       //爬到顶了
        if(i==n){
        return 1;
       }
       return climbStairs_one(i+1,n)+climbStairs_one(i+2,n);
    }
    /**
     * 方法3：记忆化递归
     *
     * 在上一种方法中，我们计算每一步的结果时出现了冗余。另一种思路是，我们可以把每一步的结果存储在 memo,
     * memo数组之中，每当函数再次被调用，我们就直接从 memo 数组返回结果。
     *
     * 在 memo 数组的帮助下，我们得到了一个修复的递归树，其大小减少到 n
     *时间复杂度：O(n)O(n)，树形递归的大小可以达到 n
     */
    public   int climbStairs_two(int i,int n,int []memo) {
        if(i>n){
            return 0;
        }
        //爬到顶了
        if(i==n){
            return 1;
        }
        if(memo[i]>0){
            return memo[i];
        }
        memo[i]= climbStairs_one(i+1,n)+climbStairs_one(i+2,n);
        return memo[i];
    }
    /**
     * 方法4
     * 动态规划
     * 不难发现，这个问题可以被分解为一些包含最优子结构的子问题，即它的最优解可以从其子问题的最优解来有效地构建，我们可以使用动态规划来解决这一问题。
     *
     * 第 ii 阶可以由以下两种方法得到：
     *
     * 在第 (i-1)(i−1) 阶后向上爬一阶。
     *
     * 在第 (i-2)(i−2) 阶后向上爬 2 阶。
     *
     * 所以到达第 i 阶的方法总数就是到第 (i-1) 阶和第 (i-2) 阶的方法数之和。
     *
     * 令 dp[i]表示能到达第 i 阶的方法总数：
     * dp[i]=dp[i-1]+dp[i-2]
     *
     */
    public   int climbStairs_three(int n) {
        if(n==1){
            return 1;
        }
       int []dp=new int[n+1];
        dp[1]=1;
        dp[2]=2;
        for(int i=3;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }






}
