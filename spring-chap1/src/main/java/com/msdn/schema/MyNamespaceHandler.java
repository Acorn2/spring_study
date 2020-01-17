package com.msdn.schema;

import com.msdn.bean.User;
import org.springframework.beans.factory.config.BeanDefinitionHolder;
import org.springframework.beans.factory.xml.NamespaceHandlerSupport;
import org.springframework.beans.factory.xml.ParserContext;
import org.w3c.dom.Node;

/**
 * @author hresh
 * @date 2020/1/2 15:41
 * @description
 */
public class MyNamespaceHandler extends NamespaceHandlerSupport {
    @Override
    public void init() {
//        registerBeanDefinitionParser("xxx",new UserParser(User.class));//自定义标签
//        registerBeanDefinitionDecoratorForAttribute("desc",new UserDefinitionDecorator());//自定义属性
        registerBeanDefinitionDecorator("node",new UserDefinitionDecorator(User.class));//自定义子标签
    }

}
