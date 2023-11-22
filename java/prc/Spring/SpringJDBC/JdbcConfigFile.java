package prc.Spring.SpringJDBC;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import prc.Spring.SpringJDBC.dao.Studentdao;
import prc.Spring.SpringJDBC.dao.Studentdaoimpl;

@Configuration
@ComponentScan(basePackages = {"prc.Spring.SpringJDBC.dao"})  //it will scan the bean file
public class JdbcConfigFile {


	
	//Data Source is the parent classs of DriverManagerDaraSource thatswhy we can use DataSource as well as DriverManagerDatasource
	@Bean("ds")
	public DriverManagerDataSource getDataSource() {
		DriverManagerDataSource ds=new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/springjdbc");
		ds.setUsername("root");
		ds.setPassword("123456");
		return ds;
		
		
		
	}
	@Bean(name = {"jdbcTemplate"})  //we can make multiple object using array
public JdbcTemplate getTemplate() {
	
	JdbcTemplate jdbcTemplate=new JdbcTemplate();
	jdbcTemplate.setDataSource(getDataSource());
	return jdbcTemplate;
	
	
}
	
//	//Dont need it in autowire
//	
//	@Bean(name = {"studentDao"})
//	public Studentdao getStudentDao() {
//		Studentdaoimpl studentDao=new Studentdaoimpl();
//		studentDao.setJdbctemplate(getTemplate());
//		return studentDao;
//	}


}
