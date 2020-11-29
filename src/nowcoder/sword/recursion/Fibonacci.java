package nowcoder.sword.recursion;

public class Fibonacci {

    //递归解法
    public int fibonaccOne(int n) {
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return fibonaccOne(n-1)+fibonaccOne(n-2);
    }


    public int FibonacciTwo(int n) {
        if(n<0){
            return 0;
        }
        if(n==1||n==2){
            return 1;
        }
        int first=1;
        int second=1;
        int result=0;
        for(int i=3;i<=n;i++){
            result=first+second;
            first=second;
            second=result;
        }
        return result;
    }



}
