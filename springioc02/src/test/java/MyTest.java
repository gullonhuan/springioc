import com.gullon.pojo.Hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        //获取spring上下文的对象
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //我们对象现在都在spring中管理，我们要使用，直接去里面取出来就可以！
        Hello hello = (Hello) context.getBean("hello");
        hello.show();
    }
}
