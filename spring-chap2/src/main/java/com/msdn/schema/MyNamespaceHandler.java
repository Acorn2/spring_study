package com.msdn.schema;

import com.msdn.bean.Car;
import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

/**
 * @author hresh
 * @date 2020/1/2 21:15
 * @description
 */
public class MyNamespaceHandler extends NamespaceHandlerSupport {
    @Override
    public void init() {
//        registerBeanDefinitionParser("car",new CarBeanDefinitionParser());
        registerBeanDefinitionParser("xxx",new CarParser(Car.class));
    }
}
