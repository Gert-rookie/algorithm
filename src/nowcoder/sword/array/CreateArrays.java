package nowcoder.sword.array;

/**
 * @Author: Gert
 * @Description: 构建乘积数组
 */
public class CreateArrays {
    /**
     * 题目描述
     * 给定一个数组A[0,1,...,n-1],请构建一个数组B[0,1,...,n-1],其中B中的元素B[i]=A[0]*A[1]*...*A[i-1]*A[i+1]*...*A[n-1]。不能使用除法。（注意：规定B[0] = A[1] * A[2] * ... * A[n-1]，B[n-1] = A[0] * A[1] * ... * A[n-2];）
     */
    public int[] multiply(int[] A) {
        if(A.length==0){
            return null;
        }
        int[] B=new int[A.length];
        B[0]=1;
        for(int i=0;i<B.length;i++){
            B[i]=1;
            for(int j=0;j<A.length;j++){
                if(i==j){
                    continue;
                }
                B[i]*=A[j];
            }
        }
        return B;
    }
}
