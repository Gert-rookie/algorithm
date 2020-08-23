package nowcoder.sort;

import util.Sort;

/**
 * create by   jake at 2019/6/2 17:40
 * 都是从小到大排序
 */
public class ExchangeSort {
    public static  void   main(String args[]){
       int  []a = {12,20,5,16,15,1,30,45,23,9};
       ExchangeSort exchangeSort=new ExchangeSort();
        //验证次数
       int testTime = 500000;
        //数组长度
        int maxSize = 10;
        //数组最大值
        int maxValue = 50;
        boolean succeed = true;
        //使用对数器进行验证
        for (int i = 0; i < testTime; i++) {
            int[] arr1 = Sort.generateRandomArray(maxSize, maxValue);
            int[] arr2 = Sort.copyArray(arr1);
            exchangeSort.InsertSort(arr1);
            Sort.comparator(arr2);
            if (!Sort.isEqual(arr1, arr2)) {
                succeed = false;
                break;
            }
        }
        System.out.println(succeed ? "Nice!" : "Fucking fucked!");
        //exchangeSort.bubbingSort(a);//冒泡排序
        //exchangeSort.ChooseSort(a);//选择排序
        //exchangeSort.InsertSort(a);//插入排序

        //System.out.println(Arrays.toString(a));
        //构造随机数组
        int[] arr = Sort.generateRandomArray(maxSize, maxValue);
        Sort.printArray(arr); //排序前
        exchangeSort.InsertSort(arr);
        Sort.printArray(arr);  //排序后
    }

    /**
     * 冒泡排序，大的数不断向后冒泡
     * @param a
     */
    public void  bubbingSort(int  []a){  //冒泡排序，时间复杂度O(n^2)  空间复杂度O(1)
        if(a==null ||a.length<2){
            return;
        }

        //第一种方式
        for(int i=0;i<a.length-1;i++){
            for(int j=0;j<a.length-1-i;j++){
                if(a[j]>a[j+1]){
                    Swap(a,j,j+1);
                }

            }
        }

        //第二种方式(依次把最大数的往后排)
        //只剩最后一个的时候不用排
        for(int end=a.length-1;end>0;end--){
            for(int j=0;j<end;j++){
                if(a[j]>a[j+1]){
                    Swap(a,j,j+1);
                }
            }
        }



    }
    /**
     *  选择排序
     *  选出最小的数据,放在前面
     */

    public  void ChooseSort(int []a){//选择排序，时间复杂度O(n^2)  空间复杂度O(1)
        if(a==null ||a.length<2){
            return;
        }
        for(int i=0;i<a.length-1;i++){
            int minIndex=i;
            for(int j=i+1;j<a.length;j++){
               minIndex=a[minIndex]>a[j]?j:minIndex;
            }
            Swap(a,i,minIndex);
        }
    }
    //从第二个数开始，往前比较，若前一个数大则交换，一直比较到第一个数
    //插入排序,时间复杂度O(n^2)  空间复杂度O(1)
    public void  InsertSort(int []a){
        if(a==null ||a.length<2){
            return;
        }
        for(int i=1;i<a.length;i++){
            for(int j=i-1;j>=0&&a[j]>a[j+1];j--){
                Swap(a,j,j+1);
            }

        }
    }
    public void  Swap(int a[],int i,int j){
        if(a[i]>a[j]){
            a[i] = a[i] ^ a[j];
            a[j] = a[i] ^ a[j];
            a[i] = a[i] ^ a[j];
        }
    }





}
