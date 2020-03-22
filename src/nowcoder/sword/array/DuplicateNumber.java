package nowcoder.sword.array;

import java.util.Arrays;

/**
 * @Author: Gert
 * @Description: 数组中重复的数字
 */
public class DuplicateNumber {
    /**
     * 题目描述
     * 在一个长度为n的数组里的所有数字都在0到n-1的范围内。 数组中某些数字是重复的，但不知道有几个数字是重复的。也不知道每个数字重复几次。请找出数组中任意一个重复的数字。 例如，如果输入长度为7的数组{2,3,1,0,2,5,3}，那么对应的输出是第一个重复的数字2。
     *
     */
    public static void main(String[] args) {
      int []a=new int[]{2,3,1,0,2,5,3};

    }
    public static boolean duplicate(int numbers[],int length,int [] duplication) {
        if(numbers.length==0){
            duplication[0]=-1;
            return false;
        }
        Arrays.sort(numbers);
        for(int i=0;i<length-1;i++){
            if(numbers[i]==numbers[i+1]){
                duplication[0]=numbers[i];
                return true;
            }
        }
        return  false;
    }
}
