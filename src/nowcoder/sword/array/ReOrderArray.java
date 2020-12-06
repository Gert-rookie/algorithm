package nowcoder.sword.array;

/**
 * @Author: Gert
 * @Description: 13、调整数组顺序使奇数位于偶数前面
 */
public class ReOrderArray {
    /**
     * 题目描述
     * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，所有的偶数位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。
     * @param array
     */
    public void reOrderArrayOne(int [] array) {
        int n=array.length;
        int []a=new int[n+1];
        int k=0;
        for(int i=0;i<n;i++){
            if(array[i]%2!=0) {
                a[k++]=array[i];
            }
        }
        for(int i=0;i<n;i++){
            if(array[i]%2==0) {
                a[k++]=array[i];
            }
        }

        for(int i=0;i<n;i++){
            array[i]=a[i];
        }
    }


    /**
     * 利用插入排序
     * @param array
     */
    public void reOrderArrayTwo(int [] array) {
        if(array==null||array.length==0){
            return ;
        }
        for(int i=1;i<array.length;i++){
            int target=array[i];
            if((array[i]&1)==1){
                int j=i;
                while(j>=1&&(array[j-1]&1)!=1){
                    array[j]=array[j-1];
                    j--;
                }
                array[j]=target;
            }

        }


    }
}
