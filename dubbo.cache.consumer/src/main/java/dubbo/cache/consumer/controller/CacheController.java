package dubbo.cache.consumer.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import dubbo.cache.consumer.SpringContextUtil;
import dubbo.simple.service.CacheService;

@RequestMapping(value = "/cache")
@ResponseBody
@RestController
public class CacheController {


    @ResponseBody
    @RequestMapping(value = "/set", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public void set(@RequestParam("key") String key, @RequestParam("value") String value) {
        CacheService cacheService = (CacheService) SpringContextUtil.getBean("cacheService");
        cacheService.set(key, value);
    }

    @ResponseBody
    @RequestMapping(value = "/get", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public Object get(@RequestParam("key") String key) {
        CacheService cacheService = (CacheService) SpringContextUtil.getBean("cacheService");
        return cacheService.get(key);
    }

    @ResponseBody
    @RequestMapping(value = "/delete", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public void delete(@RequestParam("key") String key) {
        CacheService cacheService = (CacheService) SpringContextUtil.getBean("cacheService");
        cacheService.delete(key);
    }
}
