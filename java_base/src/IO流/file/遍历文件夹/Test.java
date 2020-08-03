package IO流.file.遍历文件夹;

import java.io.File;
import java.io.FileFilter;

/**
 * @Author: sophia
 * @Description:
 * listFiles(): 列出文件夹的内容（列目录）
 * 获取文件夹file的全部内容：子文件夹和文件
 * listFiles(FileFilter): 有条件的列出文件夹中的内容
 * @Date: 2020/7/11 11:10
 * @Version :1.0
 */
public class Test {
    public static void main(String[] args) {

        //遍历当前项目文件夹下所有的文件
        File file = new File("./java_base/src");
        File[] files = file.listFiles();
        for (File f :files){
            System.out.println(f);
        }

        //创建一个过滤条件
        File file1 = new File("./java_base/src");
        FileFilter fileFilter = new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.getName().startsWith("IO流");
            }
        };
        File[] list = file1.listFiles(fileFilter);
        for(File f1 : list){
            System.out.println(f1);
        }
    }
}
