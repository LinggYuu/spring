package com.zx.mapper;

import com.zx.model.cstmbed;

import java.util.List;

public interface cstmbedmapper {
//    查询全部用床
    List<cstmbed> getbedList();
//    根据id查询床
    cstmbed getBedById(int customer_id);
//    增加一个床
    int addBed(cstmbed bed);
//    修改
    int updateBed(cstmbed bed);
    //删除
    int deleteBed(int customer_id);
}
