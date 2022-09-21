import com.gullon.Dao.OrderDao;
import com.gullon.Impl.UserDaoImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mytest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        OrderDao orderDao = (OrderDao) context.getBean("OrderDao");
        orderDao.save();
    }

    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserDaoImpl usedao = (UserDaoImpl) context.getBean("userDao");
        usedao.save();
    }

    @Test
    public void test2(){
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
        UserDaoImpl userdaoimp = ctx.getBean("userDao",UserDaoImpl.class);
        userdaoimp.save();
        System.out.println(userdaoimp.toString());
        ctx.close();

    }
}

