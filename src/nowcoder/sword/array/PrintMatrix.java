package nowcoder.sword.array;

import java.util.ArrayList;

/**
 * @author Gert
 * @date 12/18/20
 * DS:顺时针打印矩阵
 */
public class PrintMatrix {
    public ArrayList<Integer> printMatrix(int [][] matrix) {

        ArrayList<Integer>  arr=new ArrayList<>();
        if(matrix==null){
            return arr;
        }
        int  row=matrix.length;
        int  col=matrix[0].length;
        if(row<=0||col<=0){
            return arr;
        }
        int start=0;

        while(row>start*2&&col>start*2){
            printsRectangle(matrix,arr,row,col,start);
            ++start;
        }
        return arr;
    }

    /**
     * 把矩形看做坐标点
     * @param matrix
     * @param arr
     * @param row
     * @param col
     * @param start
     */
    public void  printsRectangle(int [][] matrix,ArrayList<Integer>  arr,int row,int col,int start){
        int endY=row-1-start;
        int endX=col-1-start;
        //从左往右走
        for(int i=start;i<=endX;i++){
            arr.add(matrix[start][i]);
        }
        //从上往下走
        if(start<endY){
            for(int i=start+1;i<=endY;i++){
                arr.add(matrix[i][endX]);
            }
        }
        //从右往左走
        if(start<endX && endY>start){
            for(int i=endX-1;i>=start;i--){
                arr.add(matrix[endY][i]);
            }
        }
        //从下往上走
        if(start<endX && start<endY-1 ){
            for(int i=endY-1;i>=start+1;i--){
                arr.add(matrix[i][start]);
            }
        }
    }

}
