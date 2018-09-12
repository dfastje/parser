package com.wallethub.exam.parser.data;

import org.springframework.stereotype.Component;

@Component
public class Queries {

    public String selectAllFromLogWhereColumn(LogColumns column){
        String columnName = column.name();
        String query = "SELECT * FROM log WHERE " + columnName + "=?";

        return query;
    }

    public enum LogColumns{
        timeId,
        ip,
        request,
        status,
        userAgent
    }
}
