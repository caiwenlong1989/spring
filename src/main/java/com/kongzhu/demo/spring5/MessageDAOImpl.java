package com.kongzhu.demo.spring5;

import org.springframework.stereotype.Repository;

@Repository // 使用该注解，将当前类作为仓库“Repository”使用，并交由Spring管理
public class MessageDAOImpl implements MessageDAO {

    @Override
    public String selectMessage() {
        return "Hello World!";
    }

}
