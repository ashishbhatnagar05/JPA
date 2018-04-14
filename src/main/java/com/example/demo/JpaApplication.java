package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.dao.PersonJdbcDao;

@SpringBootApplication(scanBasePackages = { "com.example" })
public class JpaApplication implements CommandLineRunner {

	private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

	@Autowired
	PersonJdbcDao personJdbcDao;

	public static void main(String[] args) {
		SpringApplication.run(JpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		LOGGER.info("All users: {}", personJdbcDao.findAll());
		LOGGER.info("User id 2: " + personJdbcDao.findById(2));
	}
}
