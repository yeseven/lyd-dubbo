package dubbo.provider.server.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Service;

import dubbo.provider.server.mapper.UserMapper;
import dubbo.simple.service.UserService;
import dubbo.simple.service.model.User;

@Component
@Service(interfaceClass = UserService.class)
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public String getUserName(Integer userId) {
        String userName = "xxxxxYYYYYY";
        return userName;
    }

    @Override
    public List<User> getLastHundredUser() {
        try {
            Thread.sleep(800);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return userMapper.getAllUser1();
    }

    @Override
    public List<User> getFirstHundredUser() {
        try {
            // sleep 测试超时
            Thread.sleep(800);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return userMapper.getAllUser2();
    }
}
