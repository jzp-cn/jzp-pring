package step1.com.jzp;

import org.junit.Test;

/**
 * @author jzp
 * @create 2017-10-31 0:39
 */
public class BeanFactoryTest {

    @Test
    public void test(){
        //初始化beanFactory
        BeanFactory beanFactory = new BeanFactory();

        //注入bean
        BeanDefinition beanDefinition = new BeanDefinition(new HelloWorldService());
        beanFactory.registerBeanDefinition("helloWorldService", beanDefinition);

        //获取bean
        HelloWorldService helloWorldService = (HelloWorldService)beanFactory.getBean("helloWorldService");
        helloWorldService.helloWorld();

    }
}
