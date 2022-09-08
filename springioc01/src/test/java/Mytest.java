//import com.gullon.dao.UserDaoImplmysql;
//import com.gullon.dao.UserDdaoImplorcle;
//import com.gullon.service.UserService;
//import com.gullon.service.UserServiceImpl;

import com.gullon.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mytest {
    public static void main(String[] args){
//        UserServiceImpl userService = new UserServiceImpl();
//
//        userService.setUserDao(new UserDdaoImplorcle() );
//
//        userService.getUser();

        //获取appicationcontext, 拿到spring的容器
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //容器在手，天下我有，总结get
        UserServiceImpl userService =  (UserServiceImpl) context.getBean("mysql");

        userService.getUser();
    }
}
