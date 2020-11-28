import com.xizi.dao.UserDaoImpl;
import com.xizi.dao.UserDaoMysqlImpl;
import com.xizi.dao.UserDaoOracleImpl;
import com.xizi.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
//        UserServiceImpl userService = new UserServiceImpl();
//        userService.setUserDao(new UserDaoMysqlImpl());
//        userService.setUserDao(new UserDaoOracleImpl());
//        userService.getUser();


        //获取ApplicationContext: 拿到Spring容器
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //容器在手 天下我有 需要什么 就直接get什么
        UserServiceImpl userServiceImpl = (UserServiceImpl) context.getBean("UserServiceImpl");
        userServiceImpl.getUser();
    }

}
