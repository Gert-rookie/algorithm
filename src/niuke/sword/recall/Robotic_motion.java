package niuke.sword.recall;

/**
 * @ProjectName: demo
 * @Package: top.fotg.demo.controller
 * @ClassName: Robotic_motion
 * @Author:  Gert
 *todo @Description:机器人的运动范围
 * @Date: 2019/8/26 17:39
 * @Version: 1.0
 */
public class Robotic_motion {
    /**
     * 地上有一个m行和n列的方格。一个机器人从坐标0,0的格子开始移动，每一次只能向左，右，上，下四个方向移动一格，但是不能进入行坐标和列坐标的数位之和大于k的格子。 例如，当k为18时，机器人能够进入方格（35,37），因为3+5+3+7 = 18。但是，它不能进入方格（35,38），因为3+5+3+8 = 19。请问该机器人能够达到多少个格子？
     */
    public static void main(String[] args) {
        Robotic_motion roboticmotion =new Robotic_motion();
        int a= roboticmotion.movingCount(5,10,10 );
        System.out.println(a);
    }
    public int movingCount(int threshold, int rows, int cols) {
        if(rows<=0||cols<=0||threshold<=0){
            return 0;
        }
        int []visited=new int[rows*cols];

        return passRounte(threshold,rows,cols,0,0,visited);
    }
    public  int  passRounte(int threshold, int rows,int cols,int row,int col,int []visted){
         int count=0;
         if(canWalkInto(threshold,rows,cols,row,col,visted)){
             visted[row*cols+col]=1;
             count=1+passRounte(threshold,rows,cols,row-1,col,visted)+
                     passRounte(threshold,rows,cols,row+1,col,visted)+
                     passRounte(threshold,rows,cols,row,col-1,visted)+
                     passRounte(threshold,rows,cols,row,col+1,visted);

         }
         return count;




    }
    public  boolean canWalkInto(int threshold, int rows,int cols,int row,int col,int []visted){
             if(row>=0&&row<rows&&col>=0&&col<cols&&getSumOfDigits(row)+getSumOfDigits(col)<=threshold
             &&visted[row*cols+col]==0){
                 return  true;
             }else {
                 return false;
             }
    }
    private  int getSumOfDigits(int number){
        int sum=0;
         while (number!=0){
             sum+=number%10;
             number=number/10;
         }
         return  sum;
    }
}
