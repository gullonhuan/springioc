import com.gullon.jopo.User;
import com.gullon.jopo.UserT;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        //spring容器
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserT user = (UserT) context.getBean("u2");
        user.show();
    }
}
