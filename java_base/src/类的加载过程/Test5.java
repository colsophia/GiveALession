package 类的加载过程;

/**
 * @Author: sophia
 * @Description:
 * @Date: 2020/2/26 12:03
 * @Version :1.0
 */
public class Test5 {
    public static void main(String[] args) {
        Test7.test();
    }
}
class Test7{
    static{
        System.out.println("Test7被加载");
    }
    public static void test(){}
}
