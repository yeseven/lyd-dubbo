package dubbo.simple.service;

import java.util.List;

import dubbo.simple.service.model.User;

/**
 * 
 * <p>
 * ���⣺ UserService
 * </p>
 * <p>
 * �������ڣ� 2017��3��8��
 * </p>
 * <p>
 * ��ȫ����UserService
 * </p>
 * ���ߣ�¦��
 */
public interface UserService {
    /**
     * 
     * �� ����ͨ���û�id��ȡ�û�����<br/>
     * �� �ߣ�¦��<br/>
     * �������ڣ�2017��3��7��</p>
     */
    String getUserName(Integer userId);

    /**
     * 
     * �� ������ȡ�����100���û���Ϣ<br/>
     * �� �ߣ�¦��<br/>
     * �������ڣ�2017��3��7��</p>
     */
    List<User> getLastHundredUser();

    /**
     * 
     * �� ������ȡ�����100���û���Ϣ<br/>
     * �� �ߣ�¦��<br/>
     * �������ڣ�2017��3��7��</p>
     */
    List<User> getFirstHundredUser();
}
