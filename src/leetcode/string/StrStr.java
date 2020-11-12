package leetcode.string;

import java.util.Arrays;

/**
 * @author Gert
 * @date 2020/9/13
 */
public class StrStr {

    //kmp算法
    public static  void  getNexts(int []next,String s){
        int j=0;
        next[0]=0;
        for(int i=1; i<s.length();i++) {
           while(j>0&&s.charAt(i)!=s.charAt(j)){
               j=next[j-1];
           }
           if(s.charAt(i)==s.charAt(j)){
               j++;
           }
           next[i]=j;



        } // 注意i从1开始
    }

    public static void main(String[] args) {
        String  mainString="hello";
        String  str="aabaaf";
        int []next=new  int[str.length()];
        StrStr.getNexts(next,str);
        System.out.println(Arrays.asList(next));
    }
}
