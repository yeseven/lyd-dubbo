package dubbo.consumer.server.controller;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;

import dubbo.simple.service.UserService;
import dubbo.simple.service.model.User;

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
@ResponseBody
@RestController
public class TestController {
    // reference注解找到provider的service
    @Reference
    private UserService userService;

    @ResponseBody
    @RequestMapping(value = "/test", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public String test() {
        return userService.getUserName(1);

    }

    @ResponseBody
    @RequestMapping(value = "/users", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<User> users() {
        return userService.getLastHundredUser();

    }
}
