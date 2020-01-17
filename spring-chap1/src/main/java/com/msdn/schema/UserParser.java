package com.msdn.schema;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.beans.factory.xml.BeanDefinitionParser;
import org.springframework.beans.factory.xml.ParserContext;
import org.w3c.dom.Element;

/**
 * @author hresh
 * @date 2020/1/2 15:43
 * @description
 */
public class UserParser implements BeanDefinitionParser {
    private Class<?> beanclass;

    public UserParser(Class<?> beanclass) {
        this.beanclass = beanclass;
    }

    @Override
    public BeanDefinition parse(Element element, ParserContext parserContext) {
        RootBeanDefinition beanDefinition = new RootBeanDefinition();
        beanDefinition.setBeanClass(beanclass);
        beanDefinition.setLazyInit(false);

        String name = element.getAttribute("name");

        beanDefinition.getPropertyValues().add("name",name);
        BeanDefinitionRegistry beanDefinitionRegistry = parserContext.getRegistry();
//        beanDefinitionRegistry.registerBeanDefinition(beanclass.getName(),beanDefinition);//注册bean到BeanDefinitionRegistry中

        String id = element.getAttribute("id");
        beanDefinitionRegistry.registerBeanDefinition(id,beanDefinition);
        return beanDefinition;
    }
}
