import com.ly.dao.UserDaoImpl;
import com.ly.dao.UserDaoMysql;
import com.ly.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {
    public static void main(String[] args) {

        //获取applicationcontext
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");


        //容器有了，需要什么就get什么
        UserServiceImpl userSeviceImpl = (UserServiceImpl) context.getBean("userServiceImpl");
        userSeviceImpl.getUser();

        //        //用户实际调用的是业务层，dao层他们不需要接触
//        UserServiceImpl userService = new UserServiceImpl();
//
//        //通过set来调不同的，这里强转了以下类型
//        userService.setUserDao(new UserDaoMysql());
//
//
//        userService.getUser();
    }
}

//这里 的test类就是模拟 的controller