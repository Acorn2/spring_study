package ioc_study;

import com.msdn.bean.Boy;
import com.msdn.editor.DateEditor;
import org.junit.Test;
import org.springframework.beans.BeanWrapperImpl;
import org.springframework.beans.PropertyEditorRegistrar;
import org.springframework.beans.SimpleTypeConverter;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.CustomEditorConfigurer;
import org.springframework.beans.propertyeditors.URIEditor;
import org.springframework.beans.propertyeditors.URLEditor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.beans.PropertyEditor;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

/**
 * @author hresh
 * @date 2020/1/9 10:58
 * @description
 */
public class PropertyEditorTest {

    @Test
    public void updateBean() throws MalformedURLException {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans_editor.xml");

        CustomEditorConfigurer editorConfigurer = (CustomEditorConfigurer) context.getBean("editorConfigurer");
        Boy boy = (Boy) context.getBean("boy");
        System.out.println(boy);
        System.out.println(boy.getBirthday());


        SimpleTypeConverter converter=new SimpleTypeConverter();
        URL url=converter.convertIfNecessary("http://www.springframework.org",URL.class);
        System.out.println(url.toString());

    }

    @Test
    public void propertyEditorTest() throws Exception{
        PropertyEditor propertyEditor = new URLEditor();
        propertyEditor.setAsText("http://www.springframework.org");
        Object value = propertyEditor.getValue();
        assertTrue(value instanceof URL);
        URL url = (URL) value;
        assertEquals(url.toString(),propertyEditor.getAsText());
    }

    @Test
    public void testCustomEditorForSingleProperty(){
        Boy boy = new Boy();
        BeanWrapperImpl beanWrapper = new BeanWrapperImpl(boy);
        DateEditor dateEditor = new DateEditor();
        dateEditor.setDateFormat(new SimpleDateFormat("yyyy年MM月dd日"));
        beanWrapper.registerCustomEditor(Date.class,"birthday",dateEditor);
        beanWrapper.setPropertyValue("name","hresh");
        beanWrapper.setPropertyValue("birthday","1997年1月1日");

        System.out.println(boy.getBirthday());
        System.out.println(beanWrapper.getPropertyValue("birthday"));
        System.out.println(dateEditor.getAsText());

        beanWrapper.setPropertyValue("name","hresh");
        beanWrapper.setPropertyValue("birthday","1998年1月1日");
        System.out.println(boy.getBirthday());
        System.out.println(dateEditor.getAsText());
    }

}
