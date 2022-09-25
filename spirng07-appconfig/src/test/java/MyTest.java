import com.gullon.configer.GullonConfig;
import com.gullon.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyTest {
    //如果完全使用了配置类方法去做，我们就只能通过AnnotationConfig 上下来获取容器，通过配置类的class对象加载
    @Test
    public void test1(){
        ApplicationContext context = new AnnotationConfigApplicationContext(GullonConfig.class);
        User user = context.getBean("getuser",User.class);
        System.out.println(user.toString());
    }
}
