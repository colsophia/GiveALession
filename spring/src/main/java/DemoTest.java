import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: sophia
 * @Description:
 * @Date: 2020/8/3 11:23
 * @Version :1.0
 */
public class DemoTest {
    @Test
    public void test1(){
        //初始化配置文件类
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfig.class);
        //获取我们的Airplane对象
        Airplane bean = ctx.getBean(Airplane.class);
        System.out.println(bean);

        //测试第二次获取Airplane对象的时候会不会再通过@Bean注入对象
        Airplane bean2 = ctx.getBean(Airplane.class);
        System.out.println(bean2);
        ctx.close();
    }
}
