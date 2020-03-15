package leetcode.interview;

import java.util.Arrays;

/**
 * @ProjectName: ALGORITHM
 * @Package: interview.leetcode.interview
 * @ClassName: MajorityElement
 * @Author: Haoteng.Hong
 * @Description:
 * @Date: 2019/9/22 22:29
 * @Version: 1.0
 */

/**
 * todo 求众数
 * 给定一个大小为 n 的数组，找到其中的众数。众数是指在数组中出现次数大于 ⌊ n/2 ⌋ 的元素。
 *
 * 你可以假设数组是非空的，并且给定的数组总是存在众数。
 *
 * 示例 1:
 *
 * 输入: [3,2,3]
 * 输出: 3
 * 示例 2:
 *
 * 输入: [2,2,1,1,1,2,2]
 * 输出: 2
 */
public class MajorityElement {
    public static void main(String[] args) {
        int []nums=new int[]{3,2,3};
        System.out.println(MajorityElement.majorityElements(nums));


    }
    public static int majorityElements(int[] nums) {
        Arrays.sort(nums);
        int count=1;

        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                count++;
                if(count>nums.length/2){
                    return nums[i];
                }
            }else{
                count=1;
            }

        }
        return nums[0];


    }
}
