package com.msdn.schema;

import com.msdn.bean.Car;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractSimpleBeanDefinitionParser;
import org.springframework.beans.factory.xml.ParserContext;
import org.springframework.util.StringUtils;
import org.w3c.dom.Element;

/**
 * @author hresh
 * @date 2020/1/2 21:01
 * @description
 */
public class CarBeanDefinitionParser extends AbstractSimpleBeanDefinitionParser {

    @Override
    protected void doParse(Element element, ParserContext parserContext, BeanDefinitionBuilder builder) {
        String brand = element.getAttribute("brand");
        String color = element.getAttribute("color");
        double price = Double.valueOf(element.getAttribute("price"));
        int maxSpeed = Integer.valueOf(element.getAttribute("maxSpeed"));

        if(StringUtils.hasText(brand)){
            builder.addPropertyValue("brand",brand);
        }
        if(StringUtils.hasText(color)){
            builder.addPropertyValue("color",color);
        }
        builder.addPropertyValue("price",price);
        builder.addPropertyValue("maxSpeed",maxSpeed);

    }

    @Override
    protected Class<?> getBeanClass(Element element) {
        return Car.class;
    }
}
