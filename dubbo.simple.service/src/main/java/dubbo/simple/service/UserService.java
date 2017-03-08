package dubbo.simple.service;

import java.util.List;

import dubbo.simple.service.model.User;

/**
 * 
 * <p>
 * 标题： UserService
 * </p>
 * <p>
 * 创建日期： 2017年3月8日
 * </p>
 * <p>
 * 类全名：UserService
 * </p>
 * 作者：娄玉东
 */
public interface UserService {
    /**
     * 
     * 描 述：通过用户id获取用户名称<br/>
     * 作 者：娄玉东<br/>
     * 创建日期：2017年3月7日</p>
     */
    String getUserName(Integer userId);

    /**
     * 
     * 描 述：获取最近的100个用户信息<br/>
     * 作 者：娄玉东<br/>
     * 创建日期：2017年3月7日</p>
     */
    List<User> getLastHundredUser();

    /**
     * 
     * 描 述：获取最近的100个用户信息<br/>
     * 作 者：娄玉东<br/>
     * 创建日期：2017年3月7日</p>
     */
    List<User> getFirstHundredUser();
}
