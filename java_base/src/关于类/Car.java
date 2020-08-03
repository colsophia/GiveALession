package 关于类;

/**
 * @Author: sophia
 * @Description:  汽车类
 * 一个类由那两种东西组成：属性（定义在方法外）   和  方法
 * 定义在方法内中的变量叫：局部变量
 * 在一个文件中可不可以定义多个类？  可以定义
 * 在一个文件中可不可以定义多个修饰符为public的类？  不可以的，只能是那个和文件名同名的类才能有public修饰
 * 变量的命名规范：1、见名知意  2、首字母小写，多个单词后面的首字母大写parentId   3、变量是区分大小写的
 * 4、变量定义不可以用关键字   5、变量不可以以数字开头，可以由字母，下划线，$，数字组成
 *
 * @Date: 2020/7/8 19:33
 * @Version :1.0
 */
public class Car {

    /**
     * 构造方法
     * 1、方法名和类名相同
     * 2、没有返回值类型   注意不是没有返回值
     */
    public Car(){
        System.out.println("我是构造方法");
    }

    /**
     * 普通的Car方法
     */
    public void Car(){
        System.out.println("我是普通的Car()");
    }


    /**
     * 品牌
     */
    String  brand;

    /**
     * 颜色
     */
    String color;

    /**
     * 类型
     * 小轿车  和  越野车
     */
    String type;

    /**
     * 开车
     */
    void drive(String name){
        System.out.println(
                name +"在开"+color+"的"+brand+type);
    }
}

