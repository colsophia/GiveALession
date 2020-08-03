package IO流.file.创建文件夹;

import java.io.File;

/**
 * @Author: sophia
 * @Description:
 * mkdir: 在磁盘上创建一个文件夹
 * mkdirs: 在磁盘上批量创建文件夹
 * 如果文件夹不存在则创建文件夹，返回true
 * 如果文件夹存在则不会再创建文件夹，返回false
 * 如果磁盘有问题，有故障就会出现异常
 * @Date: 2020/7/11 10:44
 * @Version :1.0
 */
public class Test {
    public static void main(String[] args) {
        //./代表当前目录，当前项目文件夹

        //创建单个文件夹
        File file1 = new File("./测试创建文件夹2");
        boolean b1 = file1.mkdir();
        System.out.println(b1);

        //批量创建文件夹
        File file2 = new File("./测试创建文件夹2/测试2/测试3");
        boolean b2 = file2.mkdir();
        System.out.println(b2);
    }
}
