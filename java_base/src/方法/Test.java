package 方法;

/**
 * @Author: sophia
 * @Description:
 * @Date: 2020/7/7 19:22
 * @Version :1.0
 */
public class Test {
    //1、方法是啥
    public static void main(String[] args) {

    }
    //2、方法由什么组成
    /**
     * 1、修饰符： public ，static
     * 2、返回值类型：
     *      基本类型：int，long,float,double,char,short,boolean,byte
     *      引用类型：String，数组int[],String[],集合
     *      void
     * 3、方法名  main
     * 4、参数列表： String[] args（形参）
     * 5、方法体 {}
     */

    /**
     * 3、返回值和返回值类型的区别
     *  void  int 这两者的区别：
     *      void 和int都是返回值类型
     *      int: 方法返回一个int类型的数值
     *      void：此方法不返回值
     */

    /**
     * 4、方法有啥用
     *  把一个功能模块封装起来，下次再用
     */

    /**
     * 5、一个方法的返回值有啥用
     *  方法中可以调用方法
     *  调用处可以用一个变量去接收我这个有返回值的方法返回回来的值
     *  public static void main(String[] args) {
     *     int a = show2(); //int a = 2
     *     System.out.print(a);
     *  }
     *  public static int show2() {
     *         return 2;
     *  }
     *  在我们的main方法中调用了show2()方法，这个show2()方法是有返回值的，
     *  我接下来的业务需要show2()方法返回回来的值，
     *  那么我们就需要定义一个变量去接收这个show2()方法返回回来的值
     */

    /**
     * 6、return; return 一个值;两者的区别
     * return; ： 结束方法  用在哪？void
     * return 一个值;  返回一个值，并结束方法
     */

    public static void show3(){
        for(int i =1;i< 4;i++){
            if(i%2==0){  //== 是判断  =是赋值
                return;
            }
        }
    }
    /**
     * 案例一： 在if中写了一个return
     * @return
     */
    public static int show2(){
//        if(1>2){
//            System.out.println("....");
//            return 2;
//        }else{
//            System.out.println("3333");
//            return 2;
//        }
        for(int i =1;i< 4;i++){
            if(i%2==0){  //== 是判断  =是赋值
//                return 2;
                break;
            }

        }
        return 2;

    }


    public  static void show(){

    }

    /**
     * 一个类中，不能有同名的方法
     * @return
     */
//    public static int show(){
//    }

}
