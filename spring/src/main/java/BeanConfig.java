import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: sophia
 * @Description:
 * @Date: 2020/8/3 11:21
 * @Version :1.0
 */
@Configuration
public class BeanConfig {

    @Bean
    public Airplane airplane(){
        System.out.println("通过@Bean创建Airplane对象");
        //将创建的Airplane对象交给spring容器管理
        return new Airplane();
    }
}
