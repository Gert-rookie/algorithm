package nowcoder.sword.array;

/**
 * @Author: Gert
 * @Description: 矩形覆盖
 */
public class RectCovers {
    /**
     * 我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？
     * @param target
     * @return
     */
    public int RectCover(int target) {
        if(target<=2){
            return target;
        }
        //动态规划
        int[] dp=new int[target+1];
        dp[1]=1;
        dp[2]=2;
        for(int i=3;i<=target;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[target];
    }
}
