package 向上造型;

/**
 * @Author: sophia
 * @Description:
 * @Date: 2020/7/13 20:33
 * @Version :1.0
 */
public class Test {
    public static void main(String[] args) {
        /**
         * 创建了一个父亲类型的变量a，
         * 然后这个变量a指向了一个父亲类型的实例
         *       引用 指向  实例
         * 父亲   a    =   new 父亲();
         * 父亲()：调用了无参构造
         * 构造方法的作用：
         * 1、创建对象
         * 2、给对象赋初值
         */

        /**
         * 父亲类型的a变量只能点出money，house属性
         */
        父亲 a = new 父亲();


        /**
         * 儿子类型的变量son1可以调用父类的属性和方法
         */
        大儿子 son1 = new 大儿子();
        String house = son1.house;
        son1.showParent();

        /**
         * 父亲类型的变量不能调用子类的，只能调用自己本身的东西
         */
//        a.showSon1();//错误的


        /**
         *
         * 正常情况：（引用的类型和实例的类型一致）
         *  引用 指向  实例
         *  父亲   a    =   new 父亲();
         *
         * 向上造型：（引用的类型是父类类型   实例的类型是子类的类型）
         *  把子类类型的实例赋值给父类类型的引用
         *  父类类型的引用    =  子类类型的实例
         *  父亲 a = new 大儿子();
         *  将父类类型的变量a指向子类大儿子类型的实例
         *  引用能点出什么东西，我们是看等号左边
         *  方法的具体实现，我们是看？
         *      看你调用的这个方法，子类有没有去重写这个方法，
         *         如果子类重写了，那么就是执行的子类重写的这个方法
         *         那么子类没有重写父类类型的引用调用的方法，就还是执行的父类方法
         */

        //正常情况下
//        父亲 parent1 = new 父亲();
//        parent1.common();
//        大儿子 sonOne = new 大儿子();
//        sonOne.common();
//        小儿子 sonTwo = new 小儿子();
//        sonTwo.common();

        父亲 parent1 = new 大儿子();
        parent1.common();

        父亲 parent2 = new 小儿子();
        parent2.common();


    }
}
