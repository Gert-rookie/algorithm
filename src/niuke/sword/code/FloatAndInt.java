package niuke.sword.code;

/**
 * @ProjectName: ALGORITHM
 * @Package: interview.sword.code
 * @ClassName: FloatAndInt
 * @Author:  Gert
 * @Description: 给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方
 * @Date: 2019/7/15 18:02
 * @Version: 1.0
 */
public class FloatAndInt {
    public static  double Power(double base, int exponent) {
        if(exponent==0){
            return 1;
        }
       return  Math.pow(base,exponent);

    }

    public static void main(String[] args) {
        System.out.println(FloatAndInt.Power(3,4));
    }
}
