package 关于String字符串拼接创建了几个对象;
/**
 *@Author: sophia
 *@Description:创建三个对象，加号拼接的时候一个StringBuilder  一个new   一个StringBuilder的toString方法中有new
 *@Date: 2020年2月4日 下午2:37:31
 *@Version :1.0
 */
public class StringCreate2 {
	public static void main(String[] args) {
		String a = "Hello" + new String("JSD1912");
	}
}



