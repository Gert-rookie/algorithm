package nowcoder;


import java.util.Vector;

/**
 * @Author: Gert
 * @Description:
 */
public class Test {

    public static void main(String[] args) {
        //System.out.println("1000以内的完数有：");
        //getNum();
        getCount();

    }
    /**
     * 2、一个数如果恰好等于它的因子之和，这个数就称为“完数”。例如6=1＋2＋3.编程找出1000以内的所有完数。
     */
    public static  void getNum(){
           //从6开始才有符合值
           int initValue=6;
           while(initValue<=1000){
               //每个数的因子总和
               int sum=0;
               //获取除本身之外的因子和1之外
               for(int i=2;i<initValue;i++){
                   if(initValue%i==0){
                       sum+=i;
                   }
               }
               //1是所有数的因子
               if(sum+1==initValue){
                   System.out.print(initValue+"\t");
               }
               initValue++;
           }


    }

    public static void getCount(){
        int divisor;
        //最小的完数是6
        int num = 6;
        int sum=0;


        while (num <= 1000) {
            Vector v = new Vector();
            //题目中的因子是不包括本身的
            for (int j = 1; j < num; j++) {
                if (num % j == 0) {
                    v.addElement(j);
                }
            }
            for (int z = 0; z < v.size(); z++) {
                Object obj = v.elementAt(z);
                divisor = (int) obj;
                sum += divisor;
            }
            if (num == sum) {
                System.out.println("1000以内的完数有：" + num);
                //break导致当前while循环终止
               // break;
            }

            sum = 0;
            num++;
        }
        System.out.println();

    }

}
