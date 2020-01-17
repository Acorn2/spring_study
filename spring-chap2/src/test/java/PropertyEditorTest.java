import com.msdn.bean.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author hresh
 * @date 2020/1/10 16:15
 * @description
 */
public class PropertyEditorTest {

    @Test
    public void updateBean(){
        ApplicationContext context = new ClassPathXmlApplicationContext("person_car.xml");

        Person person = (Person) context.getBean("person");
        System.out.println(person);
    }
}
