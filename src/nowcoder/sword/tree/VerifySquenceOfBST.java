package nowcoder.sword.tree;

import java.util.Arrays;

/**
 * @author Gert
 * @date 12/19/20
 */
public class VerifySquenceOfBST {
    /**
     * 输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。如果是则返回true,否则返回false。假设输入的数组的任意两个数字都互不相同。
     *
     */
    public boolean VerifySquenceOfBST(int [] sequence) {

        if(sequence==null||sequence.length<=0){
            return false;
        }
        int length=sequence.length;
        int root=sequence[length-1];

        int i=0;
        for(;i<length-1;i++){
            if(sequence[i]>root){
                break;
            }
        }
        int j=i;
        for(;j<length-1;j++){
            if(sequence[j]<root){
                return false;
            }
        }
        boolean left=true;
        if(i>0){
            left=VerifySquenceOfBST(Arrays.copyOfRange(sequence,0,i));
        }
        boolean right=true;
        if(i<length-1){
            right=VerifySquenceOfBST(Arrays.copyOfRange(sequence,i,length-1));
        }
        return  (left && right);

    }





}
