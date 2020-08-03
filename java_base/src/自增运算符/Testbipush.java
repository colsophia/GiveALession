package 自增运算符;

/**
 * @Author: sophia
 * @Description:
 * @Date: 2020/7/3 10:34
 * @Version :1.0
 */

public class Testbipush {
    public static void main(String[] args) {
        int a = -127;
        int b = 50;
        int v = -2;
        int c = 100;
        int d = 4;
        int e = 127;
    }
}

/**
 *     Code:
 *        0: bipush        -127
 *        2: istore_1
 *        3: bipush        50
 *        5: istore_2
 *        6: bipush        -2
 *        8: istore_3
 *        9: bipush        100
 *       11: istore        4
 *       13: iconst_4
 *       14: istore        5
 *       16: bipush        127
 *       18: istore        6
 *       20: return
 */