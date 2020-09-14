import com.ly.config.MyConfig;
import com.ly.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
//        ApplicationContext context = new ClassPathXmlApplicationContext();
          ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
          User getUser = context.getBean("user",User.class);
//        方法名就是bean的名字
        System.out.println(getUser.getName());
    }
}
