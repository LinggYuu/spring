package com.zx.mapper;

import com.zx.model.cstmbed;
import com.zx.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class cstmbedmappertest {


    DateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
    @Test
    public void test(){

        SqlSession sqlSession = MybatisUtils.getSqlSession();

        cstmbedmapper bedmapper = sqlSession.getMapper(cstmbedmapper.class);
        List<cstmbed> bedlist = bedmapper.getbedList();

        for (cstmbed bed : bedlist) {
            System.out.println(bed);
        }
        sqlSession.close();
    }
    @Test
    public void test2(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        cstmbedmapper bedmapper = sqlSession.getMapper(cstmbedmapper.class);
        cstmbed bed1 = bedmapper.getBedById(1);
        System.out.println(bed1);
        sqlSession.close();
    }

//    public void test3(){
//        SqlSession sqlSession = MybatisUtils.getSqlSession();
//        cstmbedmapper bedmapper = sqlSession.getMapper(cstmbedmapper.class);
//        bedmapper.addBed;
//        sqlSession.commit();
//        sqlSession.close();
//
//    }
//    String string = "2014-3-17";
//    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
//    Date date = null;
//    @Test
    //改
//    public void test4(){
//        SqlSession sqlSession = MybatisUtils.getSqlSession();
//
//        cstmbedmapper bedmapper = sqlSession.getMapper(cstmbedmapper.class);
//        bedmapper.updateBed(new cstmbed(1,"asdasd"));
//        sqlSession.commit();
//        sqlSession.close();
//    }
    //删
    @Test
    public void test5(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        cstmbedmapper bedmapper = sqlSession.getMapper(cstmbedmapper.class);
        bedmapper.deleteBed(1);
        sqlSession.commit();
        sqlSession.close();

    }

}
