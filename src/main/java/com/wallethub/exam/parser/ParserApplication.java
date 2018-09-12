package com.wallethub.exam.parser;

import com.wallethub.exam.parser.data.LogJdbcRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Log4j2
@SpringBootApplication
public class ParserApplication implements CommandLineRunner {

    @Autowired
    LogJdbcRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(ParserApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		log.info( "Log timeId 2020-01-01 00:00:00.001 -> {}",
                repository.findByTimeId("2020-01-01 00:00:00.001") );
	}
}
