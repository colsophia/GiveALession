package 方法值传递和引用传递的区别;
/**
 *@Author: sophia
 *@Description:引用传递：形参类型是引用数据类型参数，也称为传地址，
 *</br>方法调用时，实际参数是对象（或数组），这时实际参数与形式参数指向同一个地址，
 *</br>在方法执行中，对形式参数的操作实际上就是对实际参数的操作，
 *</br>这个结果在方法结束后被保留下来，所以方法执行中形式参数的改变将会影响实际参数。
 *<br>对象是存在堆里面的，栈里面只是存的引用
 *@Date: 2020年2月22日 下午3:01:10
 *@Version :1.0
 */
public class PassByReference {

	public static void main(String[] args) {
		String[] str = new String[]{"12","23","34"};
		changeValueOfA(str);
		System.out.println("str[0] = " + str[0]);
	}

	public static void changeValueOfA(String[] str ) {
//		String[] str2 = new String[] {"aaa","bbb"}; //2的时候注释掉
//		str = str2;  //1、修改栈中的引用的值
		str[0] = "456";  //2、修改堆中的值
	}
}




