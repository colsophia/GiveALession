package 自增运算符;

/**
 * @Author: sophia
 * @Description: 演示自增运算符 ++
 * @Date: 2020/7/3 9:46
 * @Version :1.0
 */
public class Test {


    public static void main(String[] args) {
//        int a =1, b =1, c=1;
        /**
         * 1、单独使用时，在前在后都一样
         * 验证 a++ 和 ++a一样
         */
//        a++;
//        System.out.println("a++的值的：" + a);
//        ++a;
//        System.out.println("++a的值的：" + a);

        /**
         * 2、被使用的时候（混合使用）时，
         * a++:先使用a然后再自增
         * ++a:先自增a再使用a
         */
//        c = b + a++;
//        System.out.println("c = b + a++中c的值是：" + c);
//        c = b + ++a;
//        System.out.println("c = b + ++a中c的值是：" + c);

        /**
         * 看一个特殊的案例
         */
//        a = ++a;
//        System.out.println("a的值为：" + a);
        int a = 1;
        a = a++;
        System.out.println("a的值为：" + a);

    }
}
