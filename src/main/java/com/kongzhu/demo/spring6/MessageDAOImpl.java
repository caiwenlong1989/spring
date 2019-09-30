package com.kongzhu.demo.spring6;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.MapHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.Map;

@Repository // 使用该注解，将当前类作为仓库“Repository”使用，并交由Spring管理
public class MessageDAOImpl implements MessageDAO {
    @Autowired
    private DataSource dataSource;

    @Override
    public String selectMessage() {
        try {
            // Create a QueryRunner that will use connections from the given DataSource
            QueryRunner run = new QueryRunner(dataSource);

            // Execute the query and get the results back from the handler
            Map<String, Object> result = run.query("select text from message where id = ?", new MapHandler(), 1);
            return (String) result.get("text");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return "Hello World!";
    }

}
