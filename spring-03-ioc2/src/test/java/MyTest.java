import com.xizi.pojo.User;
import com.xizi.pojo.UserT;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("aplicationContext.xml");
        User user = (User) context.getBean("userNew");
        System.out.println(user.toString());

        UserT user2 = (UserT) context.getBean("user3");
        System.out.println(user2.toString());
    }
}
