package dubbo.cache.consumer;


import org.springframework.context.ApplicationContext;

/**
 * 上下文获取工具类
 * 
 * @author mengfeiyang
 *
 */
public class SpringContextUtil {
    private static ApplicationContext applicationContext;

    public static void setApplicationContext(ApplicationContext context) {
        applicationContext = context;
    }

    public static Object getBean(String beanId) {
        return applicationContext.getBean(beanId);
    }
}
