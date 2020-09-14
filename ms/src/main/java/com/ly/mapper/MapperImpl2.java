package com.ly.mapper;
import com.ly.pojo.Member;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

public class MapperImpl2 extends SqlSessionDaoSupport  implements Mapper {

    public int insertMember(Member member) {
        return getSqlSession().getMapper(Mapper.class).insertMember(member);
    };

}
