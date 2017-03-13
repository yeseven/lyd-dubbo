package dubbo.consumer.server.controller;

import org.apache.log4j.Logger;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * <p>
 * 标题：Test Action
 * </p>
 * <p>
 * 创建日期： 2017年3月7日
 * </p>
 * <p>
 * 类全名：TestController
 * </p>
 * 作者：娄玉东
 */
@RequestMapping(value = "/log")
@ResponseBody
@RestController
public class LogController {
    // reference注解找到provider的service
    Logger log = Logger.getLogger(LogController.class);

    @ResponseBody
    @RequestMapping(value = "/test", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public void test() {
        log.debug("Debug Message");
        log.info("Info Message");
        log.error("Error Message");
        System.out.println("Console log info");
    }

}
