package niuke.sword.recall;

/**
 * @ProjectName: demo
 * @Package: top.fotg.demo.arithmetic.recall
 * @ClassName: Matrix
 * @Author:  Gert
 * TODO @Description:矩阵中的路径
 * @Date: 2019/8/22 15:37
 * @Version: 1.0
 */

/**
 * 请设计一个函数，用来判断在一个矩阵中是否存在一条包含某字符串所有字符的路径。路径可以从矩阵中的任意一个格子开始，每一步可以在矩阵中向左，向右，向上，向下移动一个格子。如果一条路径经过了矩阵中的某一个格子，则该路径不能再进入该格子。 例如 a b c e s f c s a d e e 矩阵中包含一条字符串"bccced"的路径，但是矩阵中不包含"abcb"路径，因为字符串的第一个字符b占据了矩阵中的第一行第二个格子之后，路径不能再次进入该格子。
 */
public class Matrix {
    public static void main(String[] args) {
         char[] arrs = new char[]{
                  'a', 'b' ,'c', 'e',
                  's','f', 'c','s',
                  'a','d','e','e'
         };
         char[] str=new char[]{'b','c','c','e','d'};
       Matrix matrix=new Matrix();
       boolean flag=matrix.hasPath(arrs,3,4,str);
        System.out.println(flag);
    }
    public boolean hasPath(char[] matrix,int rows,int cols,char[] str){
        if(matrix==null||rows<1||cols<1||str==null){
            return false;
        }
         char [][]mat=new char[rows][cols];
         int  [][]note=new int[rows][cols];
         int index=0;
         for(int i=0;i<rows;i++){
             for(int j=0;j<cols;j++){
                 note[i][j]=0;
                 mat[i][j]=matrix[index];
                 index++;
             }
         }
         for(int i=0;i<rows;i++){
             for(int j=0;j<cols;j++){
                if(getPath(mat,str,0,note,i,j)){
                   return  true;
                }
             }
         }
         return  false;
    }
    public  boolean getPath(char[][] mat,char[] str,int index,int[][] note,int row,int col){
        //如果已经寻找到了最后一个,则返回真
        if(index==str.length){
                  return  true;
              }
        //如果越界或者该字符串已经被用过,则返回假
        if(col<0||row<0||col>=mat[0].length ||row>=mat.length||note[row][col]==1){
             return  false;
        }
        //如果该字符满足,则开始对上下左右的字符继续寻找
        if(mat[row][col]==str[index]){
              note[row][col]=1;
              index++;
            //尝试向上走
            if(getPath(mat, str, index, note, row-1, col)){
                return  true;
            }
            //尝试向下走
            if(getPath(mat, str, index, note, row+1, col)){
                return  true;
            }
            //尝试向左走
            if(getPath(mat, str, index, note, row, col-1)){
                return  true;
            }
            //尝试向右走
            if(getPath(mat, str, index, note, row, col+1)){
                return  true;
            }

        } note[row][col]=0;
        return  false;
    }
}
