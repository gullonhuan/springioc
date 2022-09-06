import com.gullon.dao.UserDaoImplmysql;
import com.gullon.dao.UserDdaoImplorcle;
import com.gullon.service.UserService;
import com.gullon.service.UserServiceImpl;

public class Mytest {
    public static void main(String[] args){
        UserServiceImpl userService = new UserServiceImpl();

        userService.setUserDao(new UserDdaoImplorcle() );

        userService.getUser();
    }
}
