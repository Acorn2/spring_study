import com.msdn.bean.AbstractCar;
import com.msdn.bean.Car;
import com.msdn.bean.Money;
import com.msdn.bean.Person;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * @author hresh
 * @date 2019/12/29 20:25
 * @description
 */
public class BeanConnection {

    @Test
    public void inheritTest(){
        ClassPathResource resource = new ClassPathResource("beans.xml");
        BeanFactory beanFactory = new XmlBeanFactory(resource);

        Car car1 = (Car) beanFactory.getBean("car1");
        System.out.println(car1);

        Car car2 = (Car) beanFactory.getBean("car2");
        System.out.println(car2);

    }

    @Test
    public void relyTest(){
        ClassPathResource resource = new ClassPathResource("beans.xml");
        BeanFactory beanFactory = new XmlBeanFactory(resource);

        Car car1 = (Car) beanFactory.getBean("car1");
        System.out.println(car1);
        Person person = (Person) beanFactory.getBean("person");
        System.out.println(person);
    }

    @Test
    public void refTest(){
        ClassPathResource resource = new ClassPathResource("beans.xml");
        BeanFactory beanFactory = new XmlBeanFactory(resource);

        Person person = (Person) beanFactory.getBean("person2");
        System.out.println(person.getDesc());
        System.out.println(person);
    }

    @Test
    public void cycleRely(){
        ClassPathResource resource = new ClassPathResource("config/beans.xml");
        BeanFactory beanFactory = new XmlBeanFactory(resource);

        Person person = (Person) beanFactory.getBean("person");
        System.out.println(person);
    }

    @Test
    public void otherGetBean(){
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");

        Car car = (Car) context.getBean("car2");
        System.out.println(car);
    }
}
