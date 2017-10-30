package step1.com.jzp;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author jzp
 * @create 2017-10-31 0:34
 */
public class BeanFactory {

    private Map<String, BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<String, BeanDefinition>();

    public Object getBean(String name) {
        return beanDefinitionMap.get(name).getBean();
    }

    public void registerBeanDefinition(String name, BeanDefinition beanDefinition) {
        beanDefinitionMap.put(name, beanDefinition);
    }
}
