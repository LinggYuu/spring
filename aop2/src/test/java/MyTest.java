import com.ly.TestC;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        TestC testC = context.getBean("testC", TestC.class);
        testC.TestN();
    }

}
