package 类的加载过程;

/**
 * @Author: sophia
 * @Description:
 * @Date: 2020/2/26 11:58
 * @Version :1.0
 */
public class Test1 {

    public static void main(String[] args) {
        new Test2();
    }
}

class Test2{
    static{
        System.out.println("我被加载了");
    }
}