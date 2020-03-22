package nowcoder.sword.characterString;

/**
 * @ProjectName: ALGORITHM
 * @Package: interview.sword.characterString
 * @ClassName: ReplaceString
 * @Author:  Gert
 * @Description: 每个空格替换成“%20”
 * @Date: 2019/7/4 0:05
 * @Version: 1.0
 */

/**
 * 请实现一个函数，将一个字符串中的每个空格替换成“%20”。例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 */
public class ReplaceString {
    public static String replaceSpace(StringBuffer str) {
        String a=str.toString();
        if(a.length()==0){
            return  a;
        }
        if(a.indexOf(" ")==-1){
            System.out.println(a);
            return a;
        }

         a=a.replaceAll(" ","%20");
        System.out.println(a);
        return a;

    }

    public static void main(String[] args) {
         String a="We Are Happy";
         StringBuffer b=new StringBuffer(a);
         ReplaceString.replaceSpace(b);
    }
}
