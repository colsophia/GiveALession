package IO流.IO.案例;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author: sophia
 * @Description: 将一个文件从此处读取出来然后写到其他文件夹中
 * @Date: 2020/7/11 15:36
 * @Version :1.0
 */
public class Test {
    public static void main(String[] args) {
        //文件输入流
        FileInputStream in = null;
        //文件输出流
        FileOutputStream out = null;
        try {
            in = new FileInputStream("./java_base/src/IO流/IO/字节流/a.jpg");
            out = new FileOutputStream("./java_base/src/IO流/IO/字节流/b.jpg");
            int totalLength = in.available();
            System.out.println("总长度：" + totalLength);
            long a = System.currentTimeMillis();
            byte[] data = new byte[1024];
            //记录每次读取的长度
            long len = 0;
            //记录已经读取到的总长度
            double sum = 0.0;
            while ((len = in.read(data)) != -1) {
                out.write(data);
                sum = sum + len;
                System.out.println("已经读取:" + len + "字节，进度" + Math.floor(sum / totalLength * 100) + "%");
                //Math.floor() 向下取整，丢掉小数
            }
            long b = System.currentTimeMillis();
            System.out.println("共耗时：" + (b - a));
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if(in != null){
                try{
                    in.close();
                } catch (IOException e){
                    e.printStackTrace();
                }
            }
            if(out != null){
                try{
                    out.close();
                } catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
