import com.ly.pojo.Hello;
import com.ly.pojo.Student;
import com.ly.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //上面的语句是固定的，用xml加载就要用这个
        //现在我们的对象都在spring中管理 了，要使用，直接从里面取出来就可以了
        Student  student =(Student)context.getBean("student");
        System.out.println(student.toString());
    }

    @Test
    public void test2(){
        ApplicationContext context1 = new ClassPathXmlApplicationContext("userbeans.xml");
        User user = context1.getBean("user2",User.class);
        System.out.println(user);
    }

}
