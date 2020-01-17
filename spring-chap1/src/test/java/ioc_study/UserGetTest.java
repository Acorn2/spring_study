package ioc_study;

import com.msdn.dao.UserDaoImpl;
import com.msdn.dao.UserDaoMysqlImpl;
import com.msdn.service.UserService;
import com.msdn.service.UserServiceImpl;
import org.junit.Test;

/**
 * @author hresh
 * @date 2019/12/17 17:19
 * @description
 */
public class UserGetTest {

    @Test
    public void getUser(){
        UserServiceImpl userService = new UserServiceImpl();
        userService.setUserDao(new UserDaoImpl());
        userService.getUser();

        userService.setUserDao(new UserDaoMysqlImpl());
        userService.getUser();
    }
}
