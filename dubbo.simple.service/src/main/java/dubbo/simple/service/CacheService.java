package dubbo.simple.service;

/**
 * 
 * <p>
 * 标题： CacheService
 * </p>
 * <p>
 * 创建日期： 2017年3月13日
 * </p>
 * <p>
 * 类全名：CacheService
 * </p>
 * 作者：娄玉东
 */
public interface CacheService {
    public Object get(String key);

    public void set(String key, Object value);

    public void delete(String key);
}
