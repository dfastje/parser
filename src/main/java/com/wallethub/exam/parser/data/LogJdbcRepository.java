package com.wallethub.exam.parser.data;

import com.wallethub.exam.parser.model.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class LogJdbcRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Autowired
    Queries queries;

    public Log findByTimeId(String timeId){
        return jdbcTemplate.queryForObject(
                queries.selectAllFromLogWhereColumn(Queries.LogColumns.timeId),
                new Object[] {timeId},
                new BeanPropertyRowMapper<Log>(Log.class)
        );
    }

}
