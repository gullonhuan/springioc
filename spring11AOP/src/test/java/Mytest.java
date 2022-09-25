import com.gullon.service.UserService;
import com.gullon.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mytest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //动态代理代理的是接口：注意点
        //UserServiceImpl userService = context.getBean("userService", UserServiceImpl.class);
        UserService userService = context.getBean("userService",UserService.class);
        userService.del();
    }
}
