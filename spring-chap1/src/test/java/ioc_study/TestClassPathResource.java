package ioc_study;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.core.env.*;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import java.util.Collections;

/**
 * @author hresh
 * @date 2019/12/18 9:24
 * @description
 */
public class TestClassPathResource {

    @Test
    public void testClassPathResource() throws IOException {
        Resource resource = new ClassPathResource("application_context.xml");
        InputStream input = resource.getInputStream();
        Assert.assertNotNull(input);
    }

    @Test
    public void PropertyResolverTest(){
        PropertySource propertySource = new MapPropertySource("source", Collections.<String, Object>singletonMap("name","hresh"));
        MutablePropertySources mutablePropertySources = new MutablePropertySources();
        mutablePropertySources.addFirst(propertySource);
        PropertyResolver propertyResolver = new PropertySourcesPropertyResolver(mutablePropertySources);

        System.out.println(propertyResolver.getProperty("name"));//hresh
        System.out.println(propertyResolver.resolveRequiredPlaceholders("name is ${name}"));//hresh
    }
}
