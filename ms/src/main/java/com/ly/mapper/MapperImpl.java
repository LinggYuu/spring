//package com.ly.mapper;
//
//import com.ly.pojo.User;
//import org.mybatis.spring.SqlSessionTemplate;
//
//import java.util.List;
//
////原先所有操作都用sqlSession来执行，现在都是用SqlSessionTemplate
//public class MapperImpl implements Mapper {
//
//    private SqlSessionTemplate sqlSession;
//
//    public void setSqlSession(SqlSessionTemplate sqlSession) {
//        this.sqlSession = sqlSession;
//    }
//
//    public List<User> selectUser(){
//        Mapper mapper = sqlSession.getMapper(Mapper.class);
//        return mapper.selectUser();
//    };
//    public int insertUser(User user){
//        return 1;
//    };
//    public int updateUser(User user){
//        return 1;
//    };
//    public void delUser(int id){
//
//    };
//}
