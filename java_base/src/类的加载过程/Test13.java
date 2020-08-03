package 类的加载过程;

import java.util.Random;

/**
 * @Author: sophia
 * @Description:
 * @Date: 2020/2/26 14:38
 * @Version :1.0
 */
public class Test13 {
    public static void main(String[] args) {
        System.out.println(Test14.RANDOM);
    }
}
class Test14{
    static{
        System.out.println("Test14类被加载");
    }
    public static final double PI = 3.1415;
    public static final int RANDOM = new Random().nextInt();
}
