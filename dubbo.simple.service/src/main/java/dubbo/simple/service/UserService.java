package dubbo.simple.service;

import java.util.List;

import dubbo.simple.service.model.User;

/**
 * 
 * <p>
 * 标题：UserService
 * </p>
 * <p>
 * 创建日期： 2017年3月13日
 * </p>
 * <p>
 * 类全名：UserService
 * </p>
 * 作者：娄玉东
 */
public interface UserService {
    String getUserName(Integer userId);

    List<User> getLastHundredUser();

    List<User> getFirstHundredUser();
}
