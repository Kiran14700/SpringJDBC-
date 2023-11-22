package prc.Spring.SpringJDBC;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import prc.Spring.SpringJDBC.dao.Studentdao;
import prc.Spring.SpringJDBC.entities.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//    	//spring jdbc=> JdbcTemplate
    	
    	
//        ApplicationContext con=new ClassPathXmlApplicationContext("/prc/Spring/SpringJDBC/Config.xml");
//        JdbcTemplate template=con.getBean("jdbcTemplate",JdbcTemplate.class);
//
    	
    	

    	
    	
//        //insert query
//        String query="insert into student values(?,?,?)";
//        
//        //fire the query
//       int result= template.update(query,125,"Prathmesh waghmare","Mumbai");
//       int result2= template.update(query,147,"Rohit shamra","Mumbai");
//       
//       if(result>0) {
//    	   result++;
// 
//       }
//       System.out.println("Number of record inserted"+result);
       
       
       
       
       //anotheir method
    	
  
//      ApplicationContext con=new ClassPathXmlApplicationContext("/prc/Spring/SpringJDBC/Config.xml");
    	
    	
    	//for Config file
    	
    	ApplicationContext con=new AnnotationConfigApplicationContext(JdbcConfigFile.class);
      Studentdao dao=con.getBean("studentdao",Studentdao.class);           //studendao is the parent class of studendao impl thatswhy we use it


      
      //insert method
     Student student =new Student();         //we are adding values throigh student class object
     student.setId(105); 
     student.setName("Brahmos");
     student.setCit("mumbai");
      
      int result=dao.insert(student);       //dao is used for bean    ,insert is an method studentdao        //student is an object of student
//                                              dao bean xml file meh (insert) methods ko inject kr rah ha taki bean xml file usma values insert kar sake jo ki jdbctemplate variable ke andhr ha
      
      System.out.println("insert record "+result);
    	
      
      
      
//      //update mewthod
//      
//      Student student =new Student();       
//    student.setId(100);
//    student.setName("Brahmos2");
//    student.setCit("Pune");
//    
//    int result=dao.update(student);
//    System.out.println("data changed "+result);
    	
    
      
      
    //delete method
    
//    Student student =new Student();       
//    student.setId(100);
//  
//  
//  int result=dao.update(student);
//  System.out.println("data deleted "+result);
  
  
//      //select method with id
//      Student student4=dao.getStudent(2);
//  System.out.println(student4);
  
    	
    	
//  //select all method
//  
//  List<Student>  student5=dao.getAllStudents(0);
//  
//  for(Student s:student5) {
//	  System.out.println(s);
//  }
  
  
  


	
  
    }
}
