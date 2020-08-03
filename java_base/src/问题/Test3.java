package 问题;

/**
 * @Author: sophia
 * @Description:  三目运算
 * @Date: 2020/7/3 20:56
 * @Version :1.0
 */
public class Test3 {
    public static void main(String[] args) {
        /**
         * 三目运算
         *          *1  ? *2 :*3;
         *          // 当 *1 为 true,此表达式的值为 *2，当 *1 为 false,此表达式的值为 *3，
         */
        int year = 2020;
        String flag = (year%4==0 && year%100!=0) ? "year" : "year2";
    }
}
