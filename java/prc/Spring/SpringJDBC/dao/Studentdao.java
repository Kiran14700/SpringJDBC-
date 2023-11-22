package prc.Spring.SpringJDBC.dao;

import java.util.List;

import prc.Spring.SpringJDBC.entities.Student;

public interface Studentdao {
public int insert(Student student);
public int update(Student student);
public int delete(Student student);

public Student getStudent(int studentId);

public List<Student> getAllStudents(int studentId);

}
