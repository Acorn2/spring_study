package ioc_study;

import com.msdn.bean.User;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * @author hresh
 * @date 2020/1/2 8:56
 * @description
 */
public class BeanDefinitionTest {

    @Test
    public  void getBean(){
//        ClassPathResource resource = new ClassPathResource("application_context.xml");
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:application_context.xml");

//        BeanFactory beanFactory = new XmlBeanFactory(resource);
//
        User user = (User) context.getBean("user");
        System.out.println(user);
    }

    @Test
    public void parseTest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("application_context.xml");

//        User user = (User) context.getBean(User.class.getName());
        User user = (User) context.getBean("user");
        System.out.println(user);
    }
}
