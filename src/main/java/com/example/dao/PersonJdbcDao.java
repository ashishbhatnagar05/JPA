package com.example.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.model.Person;

@Repository
public class PersonJdbcDao {
	@Autowired
	JdbcTemplate jdbctemplate;

	public List<Person> findAll() {
		String query = "select * from person";
		return jdbctemplate.query(query, new BeanPropertyRowMapper<Person>(Person.class));
	}

	public Person findById(int id) {
		String query = "select * from person where id=?";
		return jdbctemplate.queryForObject(query, new Object[] { id }, new BeanPropertyRowMapper<Person>(Person.class));
	}

}
