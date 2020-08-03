package 算法练习题;

import java.util.Scanner;

/**
 * @Author: sophia
 * @Description:
 * 1.某个公司采用公用电话传递数据，数据是四位的整数，在传递过程中是加密的，
 * 加密规则如下：每位数字都加上 5,
 * 然后用和除以 10 的余数代替该数字，再将第一位和第四位交换，第二位和第三位交换
 * @Date: 2020/7/6 14:49
 * @Version :1.0
 */
public class One {
    public static void main(String[] args) {
        System.out.println("请输入要加密的四位数：");
        Scanner scanner = new Scanner(System.in);
        // 获取需要加密的四位数
        int beforeNum = scanner.nextInt();
        //判断是不是四位数
        if(beforeNum <999 && beforeNum >10000){
            System.out.println("输入格式不对，我们需要的是4位数！");
            //结束虚拟机的运行
            System.exit(-1);
        }
        /**
         * 将我们的四位数字进行拆分，拆分后的值怎么存？？
         * 方法一：定义四个变量分别存
         * 方法二：采用数组存
         */

    }

    /**
     * 方法一：使用四个变量分别存
     */
    public void method1(int beforeNum){
        int qian = beforeNum/1000;
        int bai = beforeNum%1000/100;
        int shi = beforeNum%100/10;
        int ge = beforeNum%10;
    }

    /**
     * 方法二：使用四个变量分别存
     */
    public void method2(int beforeNum){
        int[] nums = new int[4];
        nums[0] = beforeNum/1000;
        nums[1] = beforeNum%1000/100;
        nums[2] = beforeNum%100/10;
        nums[3] = beforeNum%10;
    }

    public void jiami(){

    }

}
