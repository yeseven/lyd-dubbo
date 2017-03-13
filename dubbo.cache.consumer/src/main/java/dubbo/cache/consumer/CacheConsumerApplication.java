package dubbo.cache.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.context.ApplicationContext;
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
public class CacheConsumerApplication implements EmbeddedServletContainerCustomizer {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(CacheConsumerApplication.class, args);
        SpringContextUtil.setApplicationContext(applicationContext);
    }

    @Override
    public void customize(ConfigurableEmbeddedServletContainer container) {

    }
}
