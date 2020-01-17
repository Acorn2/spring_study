package com.msdn.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

/**
 * @author hresh
 * @date 2019/12/21 10:27
 * @description
 */
public class PersonFactoryPostProcessor implements BeanFactoryPostProcessor {
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        System.out.println("调用PersonFactoryPostProcessor的postProcessBeanFactory方法");
        BeanDefinition beanDefinition = configurableListableBeanFactory.getBeanDefinition("person");
        MutablePropertyValues pv = beanDefinition.getPropertyValues();
        if (pv.contains("age")){
            pv.addPropertyValue("age","23");
        }

        beanDefinition = configurableListableBeanFactory.getBeanDefinition("user");
        MutablePropertyValues pv2 = beanDefinition.getPropertyValues();
        if (pv2.contains("name")){
            pv2.addPropertyValue("name","acorn22");
        }

    }
}
