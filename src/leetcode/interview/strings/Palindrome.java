package leetcode.interview.strings;

/**
 * @ProjectName: ALGORITHM
 * @Package: interview.leetcode.interview.strings
 * @ClassName: Palindrome
 * @Author: Gert
 * @Description: 验证回文字符串
 * @Date: 2019/10/27 22:11
 * @Version: 1.0
 */
public class Palindrome {
    /*给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。

    说明：本题中，我们将空字符串定义为有效的回文串。

    示例 1:

    输入: "A man, a plan, a canal: Panama"
    输出: true
    示例 2:

    输入: "race a car"
    输出: false*/

    public static void main(String[] args) {
        
    }
    //解法1
    public static boolean isPalindrome1(String s) {
        if("".equals(s)||s.length()==1){
            return true;
        }
        s=s.replaceAll("\\p{Punct}","").replaceAll("\\p{Blank}","");
        int n=s.length();
        StringBuilder str=new StringBuilder();
        int mid=n%2==0?n/2:n/2+1;
        for(int i=s.length()-1;i>=mid;i--){
            str.append(s.charAt(i));
        }
        if(str.toString().equalsIgnoreCase(s.substring(0,n/2))){
            return true;
        }
        return false;
    }
}
