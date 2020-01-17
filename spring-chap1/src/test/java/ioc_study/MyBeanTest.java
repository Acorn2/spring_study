package ioc_study;

import com.msdn.bean.Person;
import com.msdn.bean.User;
import com.msdn.dao.UserDao;
import com.msdn.service.UserServiceImpl;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author hresh
 * @date 2019/12/17 16:41
 * @description
 */
public class MyBeanTest {

    @Test
    public void MyBean(){
        //解析application_context.xml文件 , 生成管理相应的Bean对象
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:application_context.xml");
//        ApplicationContext context = new FileSystemXmlApplicationContext("target/classes/application_context.xml");
//        ApplicationContext context = new FileSystemXmlApplicationContext("file:/F:/workspace/Spmvc_Learn/spring_study/spring-chap1/target/classes/application_context.xml");
//        ApplicationContext context = new ClassPathXmlApplicationContext("file:/F:/workspace/Spmvc_Learn/spring_study/spring-chap1/target/classes/application_context.xml");
//        BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("application_context.xml"));//XmlBeanFactory类已过时
        //getBean : 参数即为spring配置文件中bean的id .
//        User user = (User) context.getBean("user");
//        ApplicationContext context1 = new ClassPathXmlApplicationContext("F:\\workspace\\Spmvc_Learn\\spring_study\\spring-chap1\\src\\main\\java\\com\\msdn\\bean\\User.java", User.class);
        //自定义一个系统属性，名为 spring 值为配置文件全名
//        System.setProperty("spring","application_context");
        //使用占位符设置配置文件路径
//        ApplicationContext context = new ClassPathXmlApplicationContext("${spring}.xml");
//        ApplicationContext context = new ClassPathXmlApplicationContext("/application_context.xml", UserDao.class);
//        ApplicationContext context = new ClassPathXmlApplicationContext("/${spring}.xml", UserDao.class);
//        System.out.println(context.getParent());
//        System.out.println(context.getEnvironment());
//        System.out.println(context.getClassLoader());
//        User user = (User) context.getBean("user");
//        System.out.println(user);
//        System.out.println(user.hashCode());

//
//        User user1 = (User) context.getBean("user");
//        System.out.println(user1);
//        System.out.println(user1.hashCode());

        Person person = (Person) context.getBean("person");
        System.out.println(person);
        System.out.println(person.hashCode());

//        Person person2 = (Person) context.getBean("person");
//        System.out.println(person2);
//        System.out.println(person2.hashCode());

//        UserServiceImpl userService = (UserServiceImpl) context.getBean("serviceImpl");
//        userService.getUser();

    }
}
