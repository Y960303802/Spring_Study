import com.xizi.config.XiziConfig;
import com.xizi.config.xiziconfig2;
import com.xizi.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Mytest {
    public static void main(String[] args) {
//        ApplicationContext context = new AnnotationConfigApplicationContext(XiziConfig.class);
//        User getUser = context.getBean("getuser", User.class);
//        System.out.println(getUser.getName());


        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(XiziConfig.class);
        User bean = annotationConfigApplicationContext.getBean(User.class);
        System.out.println(bean);

    }
}
