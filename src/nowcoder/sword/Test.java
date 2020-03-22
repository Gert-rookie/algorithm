package nowcoder.sword;

/**
 * create by   jake at 2019/5/27 9:50
 *
 * 1. 三个同样的字母连在一起，一定是拼写错误，去掉一个的就好啦：比如 helllo -> hello
 * 2. 两对一样的字母（AABB型）连在一起，一定是拼写错误，去掉第二对的一个字母就好啦：比如 helloo -> hello
 * 3. 上面的规则优先“从左到右”匹配，即如果是AABBCC，虽然AABB和BBCC都是错误拼写，应该优先考虑修复AABB，结果为AABCC
 */
public  class  Test{
    public String Modity(String a){
        int leng=a.length();
        StringBuffer stringBuffer=new StringBuffer(a);
        int count=0;
        int  num=0;
        int matchNum=0;
        char b[]=a.toCharArray();
        char flag=b[0]; //char flag=' ';
        for(int i=1;i<b.length;i++){
           if(flag==b[i]){
               count++;
               matchNum++;
           }else {
               flag=b[i];
           }
            if(count==2){
                int index=a.indexOf(flag);
               a=stringBuffer.replace(index,index+1,"").toString();
                count=0;
                if(a.lastIndexOf(flag)-a.indexOf(flag)>1){
                    //System.out.println(a.lastIndexOf(flag)+"  "+a.indexOf(flag));
                   a=Modity(a);
                }else {
                    return a;
                }
            }else if(matchNum==1){
                num++;
                if(num==2){
                    int index=a.indexOf(flag);
                    a=stringBuffer.replace(index,index+1,"").toString();
                    num=0;
                }
                matchNum=0;

            }


        }

        System.out.println(a);
        return a;
    }

    public static void  main(String args[]){
        Test test=new Test();
        //Scanner sc=new Scanner(System.in);
        String a="wooooooow";
        test.Modity(a);
        //int count =sc.nextInt();
        //tring b[]=new String[count];
        /*for(int i=0;i<6;i++){
            sc.nextLine();
            a=sc.nextLine();
            b[i]=test.Modity(a);
        }*/
        /*for(String bb:b){
            System.out.println(bb);
        }*/
    }
}

