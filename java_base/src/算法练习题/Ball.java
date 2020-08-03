package 算法练习题;

/**
 * @Author: sophia
 * @Description:
 * 2.一球从 100 米高度自由落下，
 * 每次落地后反跳回原高度的一半；
 * 再落下，求它在第10 次落地时，共经过多少米？第 10 次反弹多高？
 * @Date: 2020/7/7 18:22
 * @Version :1.0
 */
public class Ball {
    public static void main(String[] args) {
        //记录第i次落地共经过
        double sum = 100.0;
        double high = sum;


        for(int i=1;i<=10;i++){
            //第i次反弹高度
            high = high/2.0;
            System.out.println("第 "+i+" 次落地时，共经过"+sum+"米");
            System.out.println("第 "+i+" 次反弹"+high+"米");
            //第i次共经过
            sum += 2 * high;

        }
    }
}

