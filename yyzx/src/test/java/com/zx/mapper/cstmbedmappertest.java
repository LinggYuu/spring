package com.zx.mapper;

import com.zx.model.cstmbed;
import com.zx.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class cstmbedmappertest {

    @Test
    public void test(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        cstmbedmapper bedmapper = sqlSession.getMapper(cstmbedmapper.class);
        List<cstmbedmapper> bedlist = bedmapper.getbedlist();

        for (cstmbedmapper bed : bedlist) {
            System.out.println(bed);
        }
        sqlSession.close();
    }
}
