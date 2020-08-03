package 方法值传递和引用传递的区别;
/**
 *@Author: Sophia
 *@Description:值传递：形参类型是基本数据类型，方法调用时，实际参数把它的值传递给对应的形式参数，
 * </br>形式参数只是用实际参数的值初始化自己的存储单元内容，是两个不同的存储单元，
 * </br>所以方法执行中形参值得改变不影响实际参数的值.
 * </br>可以用虚拟机栈中栈桢存的局部变量表来说明问题
 *@Date: 2020年2月22日 下午2:43:04
 *@Version :1.0
 */
public class ValuePassing {

	static int a = 0;
	public static void main(String[] args) {
		changeValueOfA();
		System.out.println(a);
	}

	public static void changeValueOfA() {
		a = 10;
	}
}


