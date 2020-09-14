//import com.ly.mapper.Mapper;
//import com.ly.pojo.User;
//import org.apache.ibatis.io.Resources;
//import org.apache.ibatis.session.SqlSession;
//import org.apache.ibatis.session.SqlSessionFactory;
//import org.apache.ibatis.session.SqlSessionFactoryBuilder;
//import org.junit.Test;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//
//import java.io.IOException;
//import java.io.InputStream;
//import java.util.List;
//
//public class MyTest {
//    @Test
//    public void test1() throws IOException {
//        String resources = "mybatis-config.xml";
//        InputStream inputStream = Resources.getResourceAsStream(resources);
//        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
//        SqlSession sqlSession = sessionFactory.openSession(true);
//        Mapper mapper = sqlSession.getMapper(Mapper.class);
//        List<User> userList=mapper.selectUser();
//        for (User user : userList) {
//            System.out.println(user);
//        }
//        sqlSession.close();
//
//    }
//
//    @Test
//    public void test2() throws IOException {
//        String resources = "mybatis-config.xml";
//        InputStream inputStream = Resources.getResourceAsStream(resources);
//        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
//        SqlSession sqlSession = sessionFactory.openSession(true);
//        Mapper mapper = sqlSession.getMapper(Mapper.class);
//        mapper.insertUser(new User("110","lll","333"));
//        sqlSession.commit();
//        sqlSession.close();
//    }
//
//    @Test
//    public void test3() throws IOException {
//        String resources = "mybatis-config.xml";
//        InputStream inputStream = Resources.getResourceAsStream(resources);
//        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
//        SqlSession sqlSession = sessionFactory.openSession(true);
//        Mapper mapper = sqlSession.getMapper(Mapper.class);
//        mapper.updateUser(new User("110","yyy","444"));
//        sqlSession.commit();
//        sqlSession.close();
//    }
//    @Test
//    public void test4() throws IOException {
//        String resources = "mybatis-config.xml";
//        InputStream inputStream = Resources.getResourceAsStream(resources);
//        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
//        SqlSession sqlSession = sessionFactory.openSession(true);
//        Mapper mapper = sqlSession.getMapper(Mapper.class);
//        mapper.delUser(110);
//        sqlSession.commit();
//        sqlSession.close();
//    }
//    @Test
//    public void test5() throws IOException{
//        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
//        Mapper mapper = context.getBean("mapper2", Mapper.class);
//            mapper.insertUser(new User("11","dd","fff"));
//    }
//
//
//}
//
