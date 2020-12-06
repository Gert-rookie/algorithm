package nowcoder.sword.code;

/**
 * @author Gert
 * @date 12/5/20
 * 数值的整次方
 */
public class Power {
    /**
     * 给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
     *
     * 保证base和exponent不同时为0
     * 示例1
     * 输入
     * 复制
     * 2,3
     * 返回值
     * 复制
     * 8.00000
     */
    public double Power(double base, int exponent) {
        if(exponent==0){
            return 1;
        }
        if(exponent==1){
            return base;
        }
        int n=exponent;
        //指数为负数
        if(exponent<0){
            n=-exponent;
        }
        double result=Power(base,n>>1);
        result*=result;
        //判断奇偶性
        if((n & 1) ==1){
            result*=base;
        }
        if(exponent<0){
            result=1/result;
        }
        return result;

    }
}
