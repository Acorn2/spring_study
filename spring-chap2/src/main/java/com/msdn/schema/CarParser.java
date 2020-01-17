package com.msdn.schema;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.beans.factory.xml.BeanDefinitionParser;
import org.springframework.beans.factory.xml.ParserContext;
import org.w3c.dom.Element;

/**
 * @author hresh
 * @date 2020/1/3 9:22
 * @description
 */
public class CarParser implements BeanDefinitionParser {
    private Class<?> beanclass;

    public CarParser(Class<?> beanclass) {
        this.beanclass = beanclass;
    }

    @Override
    public BeanDefinition parse(Element element, ParserContext parserContext) {
        RootBeanDefinition beanDefinition = new RootBeanDefinition();
        beanDefinition.setBeanClass(beanclass);
        beanDefinition.setLazyInit(false);

        String brand = element.getAttribute("brand");
        String color = element.getAttribute("color");
        double price = Double.valueOf(element.getAttribute("price"));
        int maxSpeed = Integer.valueOf(element.getAttribute("speed"));

        beanDefinition.getPropertyValues().add("brand",brand);
        beanDefinition.getPropertyValues().add("color",color);
        beanDefinition.getPropertyValues().add("price",price);
        beanDefinition.getPropertyValues().add("maxSpeed",maxSpeed);
        BeanDefinitionRegistry beanDefinitionRegistry = parserContext.getRegistry();
//        beanDefinitionRegistry.registerBeanDefinition(beanclass.getName(),beanDefinition);//注册bean到BeanDefinitionRegistry中

        String id = element.getAttribute("id");
        beanDefinitionRegistry.registerBeanDefinition(id,beanDefinition);
        return beanDefinition;
    }

}
