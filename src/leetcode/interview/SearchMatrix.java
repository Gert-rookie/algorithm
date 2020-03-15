package leetcode.interview;

/**
 * @ProjectName: ALGORITHM
 * @Package: interview.leetcode.interview
 * @ClassName: SearchMatrix
 * @Author: Haoteng.Hong
 * @Description:
 * @Date: 2019/9/22 22:44
 * @Version: 1.0
 */

/**
 * TODO 搜索二维矩阵 II
 * 编写一个高效的算法来搜索 m x n 矩阵 matrix 中的一个目标值 target。该矩阵具有以下特性：
 *
 * 每行的元素从左到右升序排列。
 * 每列的元素从上到下升序排列。
 * 示例:
 *
 * 现有矩阵 matrix 如下：
 *
 * [
 *   [1,   4,  7, 11, 15],
 *   [2,   5,  8, 12, 19],
 *   [3,   6,  9, 16, 22],
 *   [10, 13, 14, 17, 24],
 *   [18, 21, 23, 26, 30]
 * ]
 * 给定 target = 5，返回 true。
 *
 * 给定 target = 20，返回 false。
 */
public class SearchMatrix {
    public static void main(String[] args) {
        int [][]a=new int[][]{
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}

        };
        System.out.println(SearchMatrix.searchMatrixs(a,20));

    }
    public static boolean searchMatrixs(int[][] matrix, int target) {
        if(matrix.length<1){
            return false;
        }
        int i=0,j=matrix[0].length-1;

        while(i<matrix.length&&j<matrix[0].length&&i>=0&&j>=0){
            if(target<matrix[i][j]){
                j--;
            }else if(target>matrix[i][j]){
                i++;
            }else if(target==matrix[i][j]){
                return true;
            }
        }
       return  false;
    }

}
