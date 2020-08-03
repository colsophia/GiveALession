package final关键字;

/**
 * @Author: sophia
 * @Description:  final 修饰基本类型和引用类型的区别
 * final  可以修饰
 * 变量：不能被改变   ==》  基本类型  和  引用类型
 * 方法：不能被重写
 * 类：类不能被继承
 *
 * 实例成员：实例属性和实例方法
 * @Date: 2020/7/21 20:04
 * @Version :1.0
 */
public class Test {
    /**
     * 实例属性
     */
    final int a = 1;
    final String str = new String("asdfasdf");

    public void show(){}  //实例方法

    public static void main(String[] args) {
        Test test = new Test();
        // final修饰的基本类型，基本类型的值存放在jvm的栈里面
        //final 修饰的引用类型的,引用类型的值存放在jvm的里面堆里面
        //final 修饰的变量我们不能修改它存在栈中的值
        //对于引用类型的变量来说，它的地址值不能被改变说明了什么？ 引用的指向不能被改变

//        test.a = 3;

        String s = new String("12312312");
//        test.str = s;  // s 的值在栈中存的是 12312312  在堆中的地址值，final修饰，地址值不能被改变

        // 基本类型=  和引用类型=
        int  aa = 2,bb =3;
        aa = bb;  //简单的赋值，我对bb的值进行修改会不会影响我aa的值，会影响

        String str1 = new String("123");
        String str2 = new String("234");
        str1 = str2; //对str2中元素的值进行修改会不会影响我str1元素的值


       final int[] arr = new int[]{123,34};
       arr[0] = 12312;

       show2(arr);
    }

    public static void show2(final int[] x){  //final int[] x = arr
        x[0] = 34;
//        x = new int[2];
        System.out.println(x);
    }
}
