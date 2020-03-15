package niuke.sword.array;

/**
 * @ProjectName: ALGORITHM
 * @Package: interview.sword.array
 * @ClassName: SearchTwoDimenion
 * @Author:  Gert
 * @Description: 二维数组中的查找
 * @Date: 2019/7/3 20:59
 * @Version: 1.0
 */


/**
 * 在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 */
public  class SearchTwoDimenion {

    /**
     * 比对每一行的值
     * @param target
     * @param array
     * @return
     */
        public static  boolean Find(int target, int [][] array) {
            int row = (int)array.length;
            int col = (int)array[0].length;
            if (row == 0 || col == 0)
                return false;
            if (target < array[0][0] || target > array[row - 1][col - 1]){
                return false;
            }

            for(int i=0;i<array.length;i++){
                if(target>=array[i][0]){
                    for(int j=0;j<array[0].length;j++){
                        boolean flag=target==array[i][j]?true:false;
                        if(flag){
                            System.out.println(i+"   "+j);
                            return  true;

                        }
                    }
                }

            }
            return false;
        }
   /* a）如果array[ i][ j] > target 则向左走 即 j--

    b)  如果array[ i][ j] < target 则向下走 即 i++*/

    /**
     *时间复杂度O(m+n)
     * @param target
     * @param arr
     * @return
     */
        public  static  boolean  Finds(int target,int [][] arr ){
            int row = (int)arr.length;
            int col = (int)arr[0].length;
            if(row==0||col==0){
                return  false;
            }
            if(target<= arr[0][0]||target>=arr[row-1][col-1]){
                return  false;
            }
            int i=0;
            int j=col-1;
            while (i<=row&&j>=0){
                if(target>arr[i][j]){
                     i++;
                }
               else if(target<arr[i][j]){
                   j--;
                }
               else {
                    System.out.println(i+"   "+j);
                   return true;
                }
            }
            return  false;
        }

    public static void main(String[] args) {
        int [][]array={
                {1,3,5,8,10},
                {2,7,15,17,20},
                {6,15,16,18,22},
                {9,21,23,25,29}
        };
        //SearchTwoDimenion.Find(18,array);
        SearchTwoDimenion.Finds(18,array);
    }
}
