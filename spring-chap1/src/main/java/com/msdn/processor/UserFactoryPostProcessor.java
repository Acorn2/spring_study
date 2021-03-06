package com.msdn.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.core.Ordered;

/**
 * @author hresh
 * @date 2019/12/20 15:48
 * @description
 */
public class UserFactoryPostProcessor implements BeanFactoryPostProcessor,Ordered {
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        System.out.println("调用UserFactoryPostProcessor的postProcessBeanFactory方法");
        BeanDefinition beanDefinition = configurableListableBeanFactory.getBeanDefinition("user");
        MutablePropertyValues pv = beanDefinition.getPropertyValues();
        if (pv.contains("name")){
            pv.addPropertyValue("name","acorn");
        }
        beanDefinition.setScope(BeanDefinition.SCOPE_PROTOTYPE);

    }

    public int getOrder() {
        return 0;
    }
}
