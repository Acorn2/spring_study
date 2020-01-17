package ioc_study;

import org.junit.Test;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

/**
 * @author hresh
 * @date 2020/1/6 11:11
 * @description
 */
public class BeanDefinitionLoaderTest {

    @Test
    public void getBeanDefinition(){
        ClassPathResource resource = new ClassPathResource("application_context.xml");
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
        reader.loadBeanDefinitions(resource);
    }
}
