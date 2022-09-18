import com.gullon.pojo.Student;
import com.gullon.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import sun.awt.geom.AreaOp;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student student = (Student) context.getBean("student");
        System.out.printf(student.toString());

        /* Student{
         name='我来了', address=Address{address='湖南娄底'},
         books=[红楼梦, 西游记, 三国演义, 水浒传],
         hobbys=[唱, 跳, rapp, 打篮球, 即你太美],
         card={身份证=1234665897121, 建设银行=12546481312, 人民银行=99999999999, 公交卡=},
         games=[LOL, COC, BOB],
         wife='null',
         info={age=20, password=123456, sex=男, driver=20220918011, username=root}}
        */
    }

    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("Userbeans.xml");
        User user = context.getBean("user1", User.class);
        System.out.println(user.toString());
    }

    @Test
    public void test2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("Userbeans.xml");
        User user2 = context.getBean("user2", User.class);
        User user3 = context.getBean("user2", User.class);
        System.out.println(user2.hashCode());
        System.out.println(user3.hashCode());
        System.out.println(user2 == user3);
        System.out.println(user2.toString());
    }
}
