import java.lang.reflect.Field;
import java.util.Arrays;

/**
 * @Version 1.0
 * @Author:LiuXinYu
 * @Date:2020/5/14
 * @Content:
 */
public class TestDemo {
    //利用反射 --》 自省的过程
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        String str = "Hello";
        Class cl = String.class;
        Field field = cl.getDeclaredField("value");
        field.setAccessible(true);
        char[] val = (char[])field.get(str);
        val[0] = 'g';
        System.out.println(str);
    }


    public static void main8(String[] args) {
        String str1 = "hello";
        String str2 = new String("hello").intern();
        System.out.println(str1 == str2);
        //intern() 从现象上看 是手动入池
        //当前的这个字符串在常量池当中是否存在  如果存在 把常量池当中的引用 赋值给当前的引用类型变量
    }


    public static void main7(String[] args) {
        String str1 = null;
        String str2 = new String("hello");
        System.out.println(str2.equals(str1));
        //System.out.println(null.equals(str2));
        //equals 前面不能是null  空指针异常
    }


    public static void main6(String[] args) {
        String str1 = "hello";
        String str2 = new String("hello");
        System.out.println(str1 == str2);//比较的是引用
        System.out.println(str1.equals(str2));//比较的是字符串的内容

        String str3 = "hello";
        System.out.println(str1 == str3);
        System.out.println(str1.equals(str3));
        //一般情况下 如果调用equals 没有重写的话 默认时调用Object的equals方法
        //他的实现是默认比较引用是否相同
    }


    public static void func(String str,char[] array){
        str = "abcdef";
        array[0] = 'g';
    }

    public static void main5(String[] args) {
        String str1 = "hello";
        char[] val = {'a'};
        System.out.println(str1);
        System.out.println(Arrays.toString(val));
        func(str1,val);
        System.out.println(str1);
        System.out.println(Arrays.toString(val));
    }


    public static void main4(String[] args) {
        String str1 = "hello";
        String str2 = str1;
        System.out.println(str1);
        System.out.println(str2);

        str1 = "abc";
        System.out.println(str1);
        System.out.println(str2);
        //引用的指向发生了改变
        //如果通过str1去修改其指向的内容
    }


    public static void main3(String[] args) {
        String str1 = "hello";
        String str2 = "hel" + "lo";//常量 常量有个特点 在编译时期已经处理完了 已经变成hello
        System.out.println(str1 == str2);//true
        String str3 = new String("hel") + "lo";
        System.out.println(str3 == str1);//false

    }


    public static void main2(String[] args) {
        String str1 = "hello";
        String str2 = new String("hello");
        System.out.println(str1 == str2);//false
        String str3 = "hello";
        System.out.println(str1 == str3);//true
    }


    public static void main1(String[] args) {
        String str = "hello";
        System.out.println(str);
        String str2 = "abcdef";
        System.out.println(str2);
        char[] val = {'a','b','c','d','e','f'};
        String str3 = new String(val);
        System.out.println(str3);
    }
}
