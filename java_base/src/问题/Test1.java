package 问题;

/**
 * @Author: sophia
 * @Description:  代码的作用域，
 * @Date: 2020/7/3 20:49
 * @Version :1.0
 */
public class Test1 {
    /**
     * 变量b属于整个类的，也就是说这个类中所有的方法都可以去使用这个b变量
     */
    int b =2;

    public static void main(String[] args) {
        /**
         * 此a只能在main方法中使用
         */
        int a = 2;

        if(1>2){
            System.out.println("1");
        }else{
            System.out.println("2");
        }

        System.out.println("3");
    }

    public void show() {
        /**
         * 此a只能在show方法中使用
         */
        int a = 2;

    }
}
