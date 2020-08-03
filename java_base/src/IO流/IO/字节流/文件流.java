package IO流.IO.字节流;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @Author: sophia
 * @Description:
 * 文件输入流：FileInputStream
 * 文件输出流：FileOutputStream
 * @Date: 2020/7/11 14:33
 * @Version :1.0
 */
public class 文件流 {
    public static void main(String[] args)  {
        FileInputStream in = null;
        try{
            in = new FileInputStream("./java_base/src/IO流/IO/字节流/a.jpg");
            int totalLength = in.available();
            System.out.println("总长度："+ totalLength);
            /**
             * 耗时4ms
             */
            long a = System.currentTimeMillis();
            byte[] data = new byte[1024];
            //记录每次读取的长度
            long len =0;
            //记录已经读取到的总长度
            double sum=0.0;
            while ((len = in.read(data)) != -1){
                sum= sum+ len;
                System.out.println("已经读取:"+len+"字节，进度"+ Math.floor(sum/totalLength*100)+"%");
                //Math.floor() 向下取整，丢掉小数
            }
            long b = System.currentTimeMillis();
            System.out.println("共耗时："+(b-a));

//            /**
//             * 耗时1799ms
//             */
//            long c = System.currentTimeMillis();
//            long len1 =0;
//            while ((len1 = in.read()) != -1){
//                System.out.println("已经读取:"+len1+"字节，进度"+ (len/totalLength*100)+"%");
//            }
//            long d = System.currentTimeMillis();
//            System.out.println("共耗时："+(d-c));
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
        }



    }
}
