package com.wallethub.exam.parser.model;

import lombok.Data;

@Data
public class Log {
    String timeId;
    String ip;
    String request;
    String status;
    String userAgent;
}
