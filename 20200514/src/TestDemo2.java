import java.util.Arrays;

/**
 * @Version 1.0
 * @Author:LiuXinYu
 * @Date:2020/5/14
 * @Content:
 */
public class TestDemo2 {
    public static void main(String[] args) {
        String str1 = "   aba   bcabcd   ";
        String ret = str1.trim();//去掉左右两边的空格
        System.out.println(ret);
    }


    public static void main13(String[] args) {
        String str1 = "ababcabcd";
        String ret = str1.substring(1,4);//字符串的截取
        //给两个位置 从哪里开始从哪里结束  java中一般都是左闭右开
        System.out.println(ret);
    }


    public static void main12(String[] args) {
        String str1 = "ababcabcd";
        String ret = str1.substring(1);//字符串的截取
        //如果只给一个位置 代表从这个位置开始 截取到结束位置
        System.out.println(ret);
    }


    public static void main11(String[] args) {
        String str1 = "ababcabcd";
        String ret = str1.replaceFirst("abc","pp");//替换第一次出现的字符串
        System.out.println(ret);
    }


    public static void main10(String[] args) {
        String str1 = "ababcabcd";
        String ret = str1.replace("ab","pp");
        System.out.println(ret);
    }


    public static void main9(String[] args) {
        String str1 = "ababcabcd";
        String ret = str1.replace('a','p');
        System.out.println(ret);
    }


    public static void main8(String[] args) {
        String str1 = "abc";
        String str2 = "abcdef";
        System.out.println(str1.compareTo(str2));//比较字符串的大小
        //str1 > str2  正数
        //str1 < str2  负数
        //str1 == str2  0
    }


    public static void main7(String[] args) {
        String str1 = "ABCDef";
        String str2 = "abcdef";
        System.out.println(str1.equals(str2));//false
        System.out.println(str1.equalsIgnoreCase(str2));//忽略掉大小写比较是否相同
    }


    public static void main6(String[] args) {
        byte[] bytes = {97,98,99,100};//将字节数组变为字符串
        String str = new String(bytes);
        System.out.println(str);

        String str2 = "abcdef";
        byte[] bytes1 = str2.getBytes();//将字符串以字节数组的形式返回
        System.out.println(Arrays.toString(bytes1));
    }


    public static boolean func(String str){
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch < '0' || ch > '9'){
                return false;
            }
        }
        return true;
    }
    public static void main5(String[] args) {//判断是不是都是数字组成的
        String str = "12345a6";
        boolean flg = func(str);
        System.out.println(flg);
    }


    public static void main4(String[] args) {
        String str2 = "hello";
        char[] val2 = str2.toCharArray();
        System.out.println(Arrays.toString(val2));
    }


    public static void main3(String[] args) {
        String str2 = "hello";
        char ch = str2.charAt(0);//拿到字符串的某一个字符
        System.out.println(ch);
    }


    public static void main2(String[] args) {
        char[] val = {'a','b','c','d','e'};
        String str = new String(val,1,3);//偏移量
        System.out.println(str);//结果为bcd
    }


    public static void main1(String[] args) {
        char[] val = {'a','b','c','d','e'};
        String str = new String(val);
        System.out.println(str);
    }
}
