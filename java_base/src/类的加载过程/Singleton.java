package 类的加载过程;

/**
 * @Author: sophia
 * @Description:
 * @Date: 2020/2/26 14:51
 * @Version :1.0
 */
public class Singleton {

    private static Singleton instance = new Singleton(); //代码2
    //注释1位置
    private static int x = 0;
    private static int y;

    static{
        System.out.println("123465");
    }

    private Singleton(){
        x++;
        y++;
    }
    public static Singleton getInstance(){
        return instance;
    }

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton.x);
        System.out.println(singleton.y);
        System.out.println(instance);
    }
}
