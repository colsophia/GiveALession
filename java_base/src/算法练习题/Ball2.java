package 算法练习题;

/**
 * @Author: sophia
 * @Description:
 * @Date: 2020/7/7 19:03
 * @Version :1.0
 */
public class Ball2 {
    public static void main(String[] args) {
        show();
        int a = show2(); //int a = 2
    }

    public static void show() {
        //用 height表示我们第i次反弹的高度 有小数，用double
        double height = 100.0,sum = height;
        for (int i = 0; i < 10; i++) {
            height /= 2;
            System.out.println("第"+(i+1)+"次反弹高度为：" + height);
            System.out.println("第"+(i+1)+"次共经过为：" + sum);
            sum  += height*2;
        }
    }
    public static int show2() {
        return 2;
    }
}