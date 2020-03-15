package leetcode.interview;

import java.util.Arrays;

/**
 * @ProjectName: ALGORITHM
 * @Package: interview.leetcode.interview
 * @ClassName: OnlyOneNumber
 * @Author: Haoteng.Hong
 * @Description:
 * @Date: 2019/9/22 16:29
 * @Version: 1.0
 */

/**
 * todo 只出现一次的数字
 * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 *
 * 说明：
 *
 * 你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？
 * 示例 1:
 *
 * 输入: [2,2,1]
 * 输出: 1
 */
public class OnlyOneNumber {
    public static void main(String[] args) {
        int []a=new int[]{4,1,2,1,2};
        System.out.println(OnlyOneNumber.singleNumbers(a));
    }

    /**
     *思路：先对数组进行排序，然后对 nums[i] 和 nums[i + 1]进行比较，如相等，i += 2，继续下一组比较，直到取到不相等的一组。
     *
     * 　　注意：首先这个数组的长度肯定是奇数（目标数字只出现一次，其他所有数字出现两次），所以如果上述步骤没有找到不相等的一组数，那么肯定是数组的最后一个数字是单独出现的。
     * @param nums
     * @return
     */
    public int singleNumber(int[] nums) {

        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i+=2){
            if(nums[i]!=nums[i+1]){
                return nums[i];
            }
        }
        return nums[nums.length-1];
    }

    /**
     * 　思路：根据异或运算的特点，相同的数字经过异或运算后结果为0，除单独出现一次的数字外，其他数字都是出现两次的，那么这些数字经过异或运算后结果一定是0。而任何数字与0进行异或运算都是该数字本身。所以对数组所有元素进行异或运算，运算结果就是题目的答案。
     * @param nums
     * @return
     */
    public static int singleNumbers(int[] nums) {
        int num = 0;
        for (int i = 0; i < nums.length; i++) {
            num = num ^ nums[i];
        }
                return num;
    }


}
