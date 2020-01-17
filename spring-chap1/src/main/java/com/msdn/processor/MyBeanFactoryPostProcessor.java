package com.msdn.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.core.Ordered;

/**
 * @author hresh
 * @date 2019/12/20 14:08
 * @description
 */
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor,Ordered {
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        System.out.println("对容器进行处理后。。。。。");
    }

    public int getOrder() {
        return 1;
    }
}
