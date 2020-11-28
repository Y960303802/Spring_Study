import com.xizi.pojo.Hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    public static void main(String[] args) {
//        获取上下文2对象
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //对象都在Spring中管理 要使用直接取出来
        Hello hello = (Hello) context.getBean("hello");
        System.out.println(hello);
    }
}
