package nowcoder.sword.array;

/**
 * @ProjectName: ALGORITHM
 * @Package: interview.sword.array
 * @ClassName: RotateArray
 * @Author:  Gert
 * @Description: 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转
 * @Date: 2019/7/4 22:05
 * @Version: 1.0
 */
public class RotateArray {
    /**
     * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。 输入一个非减排序的数组的一个旋转，输出旋转数组的最小元素。 例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。 NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
     */


    /**
     * 解法一
     * @param array
     * @return
     */
    public static int minNumberInRotateArrayOne(int [] array) {
       if(array.length==0){
           return 0;
       }
         int min=array[0];
       for(int i=1;i<array.length;i++){
           min=min>array[i]?array[i]:min;
        }
         return min;
    }


    /**
     * 解法二
     * @param array
     * @return
     */
    public int minNumberInRotateArrayTwo(int [] array) {
        if(array==null||array.length==0){
            return 0;
        }
        int left=0;
        int right=array.length-1;
        int mid=0;
        // 最后剩下一个元素，即为答案
        while(left<right){
            // 提前退出
            if(array[left]<array[right]){
                return array[left];
            }
            mid=left+((right-left)>>1);
            if(array[mid]<array[right]){
                right=mid;
            }else if(array[mid]>array[right]){
                left=mid+1;
            }else{
                --right;
            }
        }
        return array[left];
    }

    public static void main(String[] args) {
        int []array={3,4,5,1,2};
        System.out.println(RotateArray.minNumberInRotateArrayOne(array));

    }
}
