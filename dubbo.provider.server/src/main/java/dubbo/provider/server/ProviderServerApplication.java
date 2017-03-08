package dubbo.provider.server;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * 
 * <p>
 * 标题：ProviderServer Started Application
 * </p>
 * <p>
 * 创建日期： 2017年3月7日
 * </p>
 * <p>
 * 类全名：ProviderServerApplication
 * </p>
 * 作者：娄玉东
 */
@SpringBootApplication
@MapperScan("dubbo.provider.server.mapper")
@ImportResource("provider.xml")
public class ProviderServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProviderServerApplication.class, args);
    }
}
