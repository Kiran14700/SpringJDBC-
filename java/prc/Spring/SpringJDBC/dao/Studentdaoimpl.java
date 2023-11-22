package prc.Spring.SpringJDBC.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import prc.Spring.SpringJDBC.entities.Student;
@Component("studentdao")
public class Studentdaoimpl  implements Studentdao {

	@Autowired
	private JdbcTemplate jdbctemplate;       //we use it for insert values in the student class by using getter setter method
	
	@Override
	public int insert(Student student) {
		// insert query
		String query="insert into student values(?,?,?)";    //write our sql query of insert values
		int r=this.jdbctemplate.update(query,student.getId(),student.getName(),student.getCit());   //	by update method we can update the values in table
		return r;
	}
	


	@Override
	public int update(Student student) {
		//update query
		String query2="update student set city=?,name=? where id=?";
		int r2=this.jdbctemplate.update(query2,(student.getCit()),student.getName(),student.getId());
		return r2;
	}
	
	

	
	public int delete(Student student) {
		// delete query
		String query3="Delete from student where id=?";
		int r3=this.jdbctemplate.update(query3,(student.getId()));
		return r3;
	}

	
	public Student getStudent(int studentId) {
		
		//select query
		// TODO Auto-generated method stub
		String query4="select *  from student where id=?";
		RowMapper<Student> rowMapper=new RowMapperimpl4();    //we should import RowMapper jdbc core  and RowMapperimpl is the child class of Rowmapper thatwhy we can create object of it
		
		
		Student student=this.jdbctemplate.queryForObject(query4, rowMapper,studentId);
		
		return student;
	}
	
	//if you didnt want to create anotheir class for row mapper then we use this method
	//pr phi hame har method we yeh likhna padega isliya pehla method hi thik ha
	
	
//	public Student getStudent(int studentId) {
//	
//	//select query
//	// TODO Auto-generated method stub
//	String query4="select *  from student where id=?";
//	
//	
//	Student student=this.jdbctemplate.queryForObject(query4, new RowMapper() {
//
//		@Override
//		public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
//			// TODO Auto-generated method stub
//			Student student =new Student();
//			student.setId(rs.getInt(1));       //if value is in int then implement getInt
//			student.setName(rs.getString(2));  //if value is in String then implement getString
//			student.setCit(rs.getString(3));
//			return student;
//		}
//		
//		
//	},studentId);
//	
//	return student;
//}
	
	
	//select all method
	@Override
	public List<Student> getAllStudents(int studentId) {

		String query5="Select * from Student";
		List<Student> student=this.jdbctemplate.query(query5, new RowMapperimpl4());
		return student;
	}

	public JdbcTemplate getJdbctemplate() {
		return jdbctemplate;
	}

//    @Autowired
	public void setJdbctemplate(JdbcTemplate jdbctemplate) {
		this.jdbctemplate = jdbctemplate;
	}










	


	

	

}
