package com.kongzhu.demo.spring7.mapper;

import org.apache.ibatis.annotations.Select;

public interface MessageMapper {
    @Select("select text from message where id = 1")
    String selectMessage();
}
