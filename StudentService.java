package com.example.CRUD_application;
import java.util.List;

public interface StudentService {
    Student saveStudent (Student student);
    List<Student> getAllStudent();
Student getStudentById(long id);
Student updateStudent(Student student,long id);
 void deleteStudent(long id);

}


