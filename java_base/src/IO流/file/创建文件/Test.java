package IO流.file.创建文件;

import java.io.File;
import java.io.IOException;

/**
 * @Author: sophia
 * @Description:
 * createNewFile() 创建文件
 * 返回true表示创建成功
 * 返回false表示创建失败
 * @Date: 2020/7/11 11:07
 * @Version :1.0
 */
public class Test {
    public static void main(String[] args) {
        File file1 = new File("./myfile.txt");
        boolean b = false;
        try {
            b = file1.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(b);
    }
}
