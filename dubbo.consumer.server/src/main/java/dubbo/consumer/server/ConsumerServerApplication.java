package dubbo.consumer.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * 
 * <p>
 * 标题： ConsumerServer Started Service
 * </p>
 * <p>
 * 创建日期： 2017年3月7日
 * </p>
 * <p>
 * 类全名：ConsumerServer
 * </p>
 * 作者：娄玉东
 */
@SpringBootApplication
@ImportResource("consumer.xml")
public class ConsumerServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerServerApplication.class, args);
    }
}
