package dubbo.simple.service;

/**
 * 
 * <p>
 * ���⣺CacheService
 * </p>
 * <p>
 * �������ڣ� 2017��3��10��
 * </p>
 * <p>
 * ��ȫ����CacheService
 * </p>
 * ���ߣ�¦��
 */
public interface CacheService {
    public Object get(String key);

    public void set(String key, Object value);

    public void delete(String key);
}
