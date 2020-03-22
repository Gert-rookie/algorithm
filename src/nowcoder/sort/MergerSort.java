package nowcoder.sort;

import java.util.Arrays;

/**
 * create by   jake at 2019/6/3 19:44
 * 归并排序，时间复杂度：O(N*logN)  空间复杂度O(N)
 */
public class MergerSort {
    public static void main(String[] args) {
        int  []arr = {12,20,5,16,15,1,30,45,23,9};
        MergerSort.mergerSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void  mergerSort(int []arr){
           if(arr==null || arr.length<2){
               return ;
           }
       sortProcess(arr,0,arr.length-1);
    }
    public static  void sortProcess(int []arr,int L,int R){
         if(L==R){
             return;
         }
         int mid=(L+R)/2;
         sortProcess(arr,L,mid); //左边排序
         sortProcess(arr,mid+1,R); //右边排序
         merger(arr,L,mid,R); //合并排序

    }
    public static void merger(int []arr,int L,int mid,int R){
        int []help=new int[R-L+1];  //辅助数组
        int i=0;
        int p1=L;
        int p2=mid+1;
        while (p1<=mid && p2<=R){
            help[i++]=arr[p1]<arr[p2]?arr[p1++]:arr[p2++];
        }
        //两个while必有一个不执行
        while (p1<=mid){ //p1或p2必有一个先超出
            help[i++]=arr[p1++];
        }
        while (p2<=R){
            help[i++]=arr[p2++];
        }
        //System.out.println(arr.length+"  "+help.length);
        for (i=0;i<help.length;i++){
            arr[L+i]=help[i];
        }
    }
}
