package ioc_study;

import com.msdn.bean.Car;
import com.msdn.bean.CarFactoryBean;
import com.msdn.bean.User;
import com.msdn.service.UserServiceImpl;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 * @author hresh
 * @date 2019/12/27 17:11
 * @description
 */
public class BeanFactoryTest {

    @Test
    public void getBeanTest(){
        ClassPathResource resource = new ClassPathResource("application_context.xml");
        BeanFactory beanFactory = new XmlBeanFactory(resource);
        String name = "hresh";
        System.out.println(name instanceof String);

        User user = (User) beanFactory.getBean(User.class);
        System.out.println(user);
    }

    @Test
    public void getCar() throws Exception {
        ClassPathResource resource = new ClassPathResource("beans.xml");
        BeanFactory beanFactory = new XmlBeanFactory(resource);

//        Car car = (Car) beanFactory.getBean("car");
        Car car = (Car) beanFactory.getBean("carFactoryBean3");
        System.out.println(car);
//        CarFactoryBean carFactoryBean = (CarFactoryBean) beanFactory.getBean("&carFactoryBean2");
//        System.out.println(carFactoryBean.getObject());
//        System.out.println(carFactoryBean);
    }

    @Test
    public void getUserWays(){
        ClassPathResource resource = new ClassPathResource("beans.xml");
        BeanFactory beanFactory = new XmlBeanFactory(resource);

        UserServiceImpl userService = (UserServiceImpl) beanFactory.getBean("serviceImpl");
        userService.getUser();
    }
}
