package leetcode.dynamicPlanning;

/**
 * @ProjectName: ALGORITHM
 * @Package: interview.leetcode.dynamicPlanning
 * @ClassName: LongestPalindrome
 * @Author: Gert

 * @Date: 2019/10/1 15:39

 */
public class LongestPalindrome {
    public static void main(String[] args) {
        String s="babad";
        int i=0,j=s.length()-1;
        int mid=(i+j)/2;
        StringBuilder str=new StringBuilder();
        char ch[]=s.toCharArray();
        while(i<=mid||j>=mid){
            if(ch[i]==ch[j]){
                if(i==mid||j==mid){
                   
                }
                str.append(ch[i]);
                i++;
                j--;

            }else{
                i++;
                j--;
            }
        }
        if(s.length()%2!=0){
            str.append(ch[mid]);
        }
        System.out.println(str);
    }
}
