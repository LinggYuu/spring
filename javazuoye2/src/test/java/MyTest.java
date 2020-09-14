import com.ly.TestC;
import com.ly.TestCImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("application.xml");
        TestC c = context.getBean("testC",TestC.class);
        c.TestN();
    }
}
