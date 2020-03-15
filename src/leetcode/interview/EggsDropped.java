package leetcode.interview;

/**
 * @ProjectName: ALGORITHM
 * @Package: interview.leetcode.interview
 * @ClassName: EggsDropped
 * @Author: Gert
 * @Description: 鸡蛋掉落问题
 * @Date: 2020/1/23 22:08
 * @Version: 1.0
 */
public class EggsDropped {
    public static void main(String[] args) {
        int []a=new int[]{1,2,3,4};
        System.out.println(findNumbers(a));
    }
    public static int findNumbers(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(String.valueOf(nums[i]).length()%2==0){
                count++;
            }
        }
        return count;
    }

}
