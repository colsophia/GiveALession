package IO流.IO.字节流;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @Author: sophia
 * @Description:
 * 缓冲输入流：BufferedInputStream
 * 缓冲输出流：BufferedOutputStream
 * @Date: 2020/7/11 14:43
 * @Version :1.0
 */
public class 缓冲流 {
    public static void main(String[] args) throws Exception {
        BufferedInputStream buf = null;
        try{
            FileInputStream in = new FileInputStream("./java_base/src/IO流/IO/字节流/a.jpg");
            buf = new BufferedInputStream(in);
            byte[] data = new byte[1024];
            long a = System.currentTimeMillis();
            while(buf.read(data) != -1){
                System.out.println("正在读取.....");
            }
            long b = System.currentTimeMillis();
            System.out.println("共耗时："+(b-a));
        }catch (Exception e){
           e.printStackTrace();
        }finally {
            if (buf != null){
                try{
                    buf.close();
                } catch (IOException e){
                    e.printStackTrace();
                }
            }
        }


    }
}
