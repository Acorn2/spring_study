package ioc_study;

import com.msdn.bean.User;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author hresh
 * @date 2019/12/25 14:31
 * @description
 */
public class ResourceTest {

    @Test
    public void getResource() throws IOException, URISyntaxException {
        //ClassPathResource
//        ClassPathResource resource = new ClassPathResource("application_context.xml");
////        ClassPathResource resource = new ClassPathResource("/config/beans.xml", User.class);
//        InputStream input = resource.getInputStream();
//        Assert.assertNotNull(input);
//        System.out.println(resource.getClassLoader());
//        System.out.println(resource.getPath());
//
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        System.out.println(classLoader.getResource("").getPath());

        System.out.println(this.getClass().getResource("").getPath());
        System.out.println(this.getClass().getResource("/").getPath());

        System.out.println(System.getProperty("user.dir"));

        //FileSystemResource
//        FileSystemResource resource1 = new FileSystemResource("target/classes/application_context.xml");
//        FileSystemResource resource1 = new FileSystemResource("file:/target/classes/application_context.xml");
//        FileSystemResource resource1 = new FileSystemResource("file:/F:/workspace/Spmvc_Learn/spring_study/spring-chap1/target/classes/application_context.xml");
//        FileSystemResource resource1 = new FileSystemResource("F:\\workspace\\Spmvc_Learn\\spring_study\\spring-chap1\\src\\main\\resources\\application_context.xml");
//        FileSystemResource resource1 = new FileSystemResource("F:\\workspace\\Spmvc_Learn\\spring_study\\spring-chap1\\target\\classes\\application_context.xml");
//        InputStream input = resource1.getInputStream();
//        Assert.assertNotNull(input);

//        URL url = getClass().getResource("application_context.xml");
//        System.out.println("url.toURI():"+url.toURI());
//        System.out.println("url.getPath():"+url.getPath());
//
//        Path xmlPath = new File(url.getPath()).toPath();
//        System.out.println("xmlPath:"+xmlPath);
//        FileSystemResource resource1 = new FileSystemResource(url.getPath());
//        FileSystemResource resource1 = new FileSystemResource(xmlPath);
//        System.out.println(resource1.getPath());
//        System.out.println(resource1.getDescription());

//        Resource resource = resource1.createRelative("application_context.xml");
//        System.out.println(resource);
    }
}
