package 类的加载过程;

/**
 * @Author: sophia
 * @Description:
 * @Date: 2020/2/26 12:05
 * @Version :1.0
 */
public class Test10 {
    public static void main(String[] args) {
        int a = Son.y;
    }
}
class Parent {
    public static int y = 1;
    static{
        System.out.println("Parent类被加载");
    }
}

class Son extends Parent{
    public static int x = 1;
    static{
        System.out.println("Son类被加载");
    }
}

