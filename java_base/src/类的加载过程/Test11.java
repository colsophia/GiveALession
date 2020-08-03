package 类的加载过程;

/**
 * @Author: sophia
 * @Description:
 * @Date: 2020/2/26 14:07
 * @Version :1.0
 */
public class Test11 {
    public static void main(String[] args) {
        Test12[] test12 =  new Test12[10];
    }
}
class Test12{
    static{
        System.out.println("Test12类被加载");
    }
}
