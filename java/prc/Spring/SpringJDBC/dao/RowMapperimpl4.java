package prc.Spring.SpringJDBC.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;   //we should import jdbc core rowmapper 

import prc.Spring.SpringJDBC.entities.Student;

//for fetching data implements RowMapper
public class RowMapperimpl4 implements RowMapper<Student> {

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {

		
		Student student =new Student();
		student.setId(rs.getInt(1));       //if value is in int then implement getInt
		student.setName(rs.getString(2));  //if value is in String then implement getString
		student.setCit(rs.getString(3));
		
		return student;
	}

}
