package niuke.sort;

import java.util.Arrays;

/**
 * @Author: Gert
 * @Description: 快速排序
 */
public class QKSourt {
    public static void main(String[] args) {
        int  []a = {12,20,5,16,15,1,30,45,23,9};
        QKSourt(a,0,a.length-1);
        for (int i:a) {
            System.out.print(i + " ");
        }
    }
    private static void QKSourt(int[] a, int start, int end) {
        if(a.length==0){
            return;
        }
        if(start>=end){
            return;
        }
        int left=start;
        int right=end;
        int temp=a[left];
        while(left<right){
            while (a[right]>temp && left<right){
                right--;
            }
            a[left]=a[right];
            while (a[left]<temp && left<right){
                  left++;
            }
            a[right]=a[left];
        }
        a[left]=temp;
        System.out.println(Arrays.toString(a));
        QKSourt(a,start,left-1);
        QKSourt(a,left+1,end);

    }
}
