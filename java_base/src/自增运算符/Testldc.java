package 自增运算符;

/**
 * @Author: sophia
 * @Description:
 * @Date: 2020/7/3 10:40
 * @Version :1.0
 */
public class Testldc {
    public static void main(String[] args) {
        int a = 123123112;
        int b = -2147483648;
    }
}
/**
 *  Code:
 *        0: ldc           #2                  // int 123123112
 *        2: istore_1
 *        3: ldc           #3                  // int -2147483648
 *        5: istore_2
 *        6: return
 */
