package 类的加载过程;

/**
 * @Author: sophia
 * @Description:
 * @Date: 2020/2/26 12:01
 * @Version :1.0
 */
public class Test3 {
    public static void main(String[] args) {
        int a = Test4.x;
    }

}
class Test4{
    public static int x = 10;
    static{
        System.out.println("Test4被加载");
    }
}
