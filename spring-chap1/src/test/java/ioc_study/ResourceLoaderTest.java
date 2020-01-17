package ioc_study;

import org.junit.Test;
import org.springframework.core.io.*;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.web.servlet.resource.ResourceResolver;

import java.io.IOException;

/**
 * @author hresh
 * @date 2019/12/26 10:03
 * @description
 */
public class ResourceLoaderTest {

    @Test
    public void useResourceLoader(){
        ResourceLoader resourceLoader = new DefaultResourceLoader();

        Resource resource = null;
        String location = "";

        //location以/开头
        location = "/application_context.xml";
        resource = resourceLoader.getResource(location);
        System.out.println(resource.getClass());

        //location以classpath开头
        location = "classpath:application_context.xml";
        resource = resourceLoader.getResource(location);
        System.out.println(resource.getClass());

        //抛出MalformedURLException异常，进而执行getResourceByPath方法
        location = "target/classes/application_context.xml";
        resource = resourceLoader.getResource(location);
        System.out.println(resource.getClass());

        //同上
        location = "F:/workspace/Spmvc_Learn/spring_study/spring-chap1/target/classes/application_context.xml";
        resource = resourceLoader.getResource(location);
        System.out.println(resource.getClass());

        //ResourceUtils.isFileURL(url)为true，返回FileUrlResource
        location = "file:/target/classes/application_context.xml";
        resource = resourceLoader.getResource(location);
        System.out.println(resource.getClass());

        //ResourceUtils.isFileURL(url)为false，返回UrlResource
        location = "https://cn.bing.com/";
        resource = resourceLoader.getResource(location);
        System.out.println(resource.getClass());

        resourceLoader = new FileSystemResourceLoader();
        //抛出MalformedURLException异常，进而执行getResourceByPath方法
        location = "target/classes/application_context.xml";
        resource = resourceLoader.getResource(location);
        System.out.println(resource.getClass());

        //同上
        location = "F:/workspace/Spmvc_Learn/spring_study/spring-chap1/target/classes/application_context.xml";
        resource = resourceLoader.getResource(location);
        System.out.println(resource.getClass());
    }

    @Test
    public void usePatternResolver() throws IOException {
        ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        Resource[] resources = null;
        String location = "";

        //使用DefaultResourceLoader的情况下，改变location的内容
        location = "application_context.xml";
        resources = resolver.getResources(location);//调用DefaultResourceLoader.getResource()方法
        sout(resources);

        location = "classpath*:config/beans.xml";
        resources = resolver.getResources(location);//findAllClassPathResources
        sout(resources);

        location = "classpath*:*/beans.xml";
        resources = resolver.getResources(location);//findPathMatchingResources
        sout(resources);

        location = "file:F:/workspace/Spmvc_Learn/spring_study/spring-chap1/target/classes/*/beans.xml";
        resources = resolver.getResources(location);//findPathMatchingResources
        sout(resources);

        location = "F:/workspace/Spmvc_Learn/spring_study/spring-chap1/target/classes/application_context.xml";
        resources = resolver.getResources(location);//调用resourceLoader.getResource()方法
        sout(resources);

        //更新ClassLoader
        location = "F:/workspace/Spmvc_Learn/spring_study/spring-chap1/target/classes/application_context.xml";
        resolver = new PathMatchingResourcePatternResolver(new FileSystemResourceLoader());
        resources = resolver.getResources(location);//调用FileSystemResourceLoader.getResource()方法
        sout(resources);

    }

    public void sout(Resource[] resources){
        for(Resource resource:resources){
            System.out.println(resource);
        }
    }
}
