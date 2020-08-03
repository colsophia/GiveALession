package 类的加载过程;

/**
 * @Author: sophia
 * @Description:
 * @Date: 2020/2/26 12:05
 * @Version :1.0
 */
public class Test8 {
    public static void main(String[] args) throws ClassNotFoundException{
        Class.forName("nine.Test9");
    }
}
class Test9{
    static{
        System.out.println("Test9被加载");
    }
}
