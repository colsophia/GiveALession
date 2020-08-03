package 关于类;

/**
 * @Author: sophia
 * @Description: 在测试类中调用Car类中的driver方法，并且传入一个name
 * @Date: 2020/7/8 19:47
 * @Version :1.0
 */
public class Test {

    public static void main(String[] args) {
//        new Car();//实例
//        Car c;  //对象

        /**
         * 先理解：调用这个Car中属性和方法的时候，就必须要先创建一个这个类的对象
         * 后面学：在其他类中   调用这个Car中  非静态非私有的   属性和方法的时候，就必须要先创建一个这个类的对象
         */
        Car c = new Car();
        int a = 123;
        c.brand = "兰博基尼";
        c.color = "蓝色";
        c.type = "跑车";
        c.Car();

        User u  = new User();
        u.name = "隔壁老王";
        c.drive(u.name);
    }
}
