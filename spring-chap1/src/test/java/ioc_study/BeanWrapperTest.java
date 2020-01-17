package ioc_study;

import com.msdn.bean.Car;
import com.msdn.bean.Man;
import com.msdn.bean.Person;
import org.junit.Test;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;
import org.springframework.beans.PropertyAccessorFactory;
import org.springframework.beans.PropertyValue;

import java.util.HashMap;
import java.util.Map;

/**
 * @author hresh
 * @date 2020/1/7 10:47
 * @description
 */
public class BeanWrapperTest {

    @Test
    public void doBeanWrapper(){
        Car car = new Car();
//        BeanWrapper beanWrapperOfCar = PropertyAccessorFactory.forBeanPropertyAccess(car);
//        PropertyValue brandValue = new PropertyValue("brand","东风");
//        PropertyValue maxSpeedValue = new PropertyValue("maxSpeed",333);
//        PropertyValue priceValue = new PropertyValue("price",202020);
//
////        beanWrapperOfCar.setPropertyValue(brandValue);
//        beanWrapperOfCar.setPropertyValue("brand","东方红");
//        beanWrapperOfCar.setPropertyValue(maxSpeedValue);
//        beanWrapperOfCar.setPropertyValue(priceValue);
//
//        System.out.println(car);

        Man person = new Man();
        BeanWrapper beanWrapper = PropertyAccessorFactory.forBeanPropertyAccess(person);

        PropertyValue nameValue = new PropertyValue("name","hresh");
        PropertyValue ageValue = new PropertyValue("age",23);
        PropertyValue carValue = new PropertyValue("car",car);
        String[] hobbies = {"跑步","唱歌","看书"};
        PropertyValue hobbyValue = new PropertyValue("hobbies",hobbies);
        Map<String,Object> relatives = new HashMap<>();
        relatives.put("Father","hresh");
        relatives.put("Son","hresh");
        PropertyValue relativeValue = new PropertyValue("relatives",relatives);
        Integer[][] nums = {{1,2,3},{4,5,6}};
        PropertyValue numsValue = new PropertyValue("nums",nums);

//        beanWrapper.setPropertyValue(nameValue);
        beanWrapper.setPropertyValue("name","hresh");
        beanWrapper.setPropertyValue(ageValue);
        beanWrapper.setPropertyValue(carValue);
        beanWrapper.setPropertyValue("car.brand","东方红");
        beanWrapper.setPropertyValue(hobbyValue);
        beanWrapper.setPropertyValue("hobbies[1]","跳舞");
        beanWrapper.setPropertyValue(relativeValue);
        beanWrapper.setPropertyValue("relatives['Father']","clearLove");
        beanWrapper.setPropertyValue(numsValue);
        beanWrapper.setPropertyValue("nums[1][2]",22);

        System.out.println(person);
//        System.out.println(beanWrapper.getWrappedInstance());
//        System.out.println(person == beanWrapper.getWrappedInstance());
//
//        int age = (Integer) beanWrapper.getPropertyValue("age");
//        String hobby = (String) beanWrapper.getPropertyValue("hobbies[1]");
//        String brand = (String) beanWrapper.getPropertyValue("car.brand");
//        String relative = (String) beanWrapper.getPropertyValue("relatives['Father']");
//
//        String result = String.format("%s is %d years old ,is interested in %s, has a relative named %s , also has a %s car !",person.getName(),age,hobby,relative,brand);
//        System.out.println(result);
    }
}
