package com.msdn.schema;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanDefinitionHolder;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.beans.factory.xml.BeanDefinitionDecorator;
import org.springframework.beans.factory.xml.ParserContext;
import org.w3c.dom.Attr;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

/**
 * @author hresh
 * @date 2020/1/3 14:39
 * @description
 */
public class UserDefinitionDecorator implements BeanDefinitionDecorator {
    private Class<?> beanclass;

    public UserDefinitionDecorator(Class<?> beanclass) {
        this.beanclass = beanclass;
    }

    @Override
    public BeanDefinitionHolder decorate(Node node, BeanDefinitionHolder beanDefinitionHolder, ParserContext parserContext) {
//        String desc = ((Attr)node).getValue();
//        beanDefinitionHolder.getBeanDefinition().getPropertyValues().add("desc",desc);
//        return beanDefinitionHolder;

        BeanDefinition beanDefinition = beanDefinitionHolder.getBeanDefinition();

        String name = ((Element)node).getAttribute("name");
        String value = ((Element)node).getAttribute("value");

        beanDefinition.getPropertyValues().add(name,value);
        return beanDefinitionHolder;
    }
}
