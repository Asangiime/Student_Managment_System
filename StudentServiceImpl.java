package com.example.CRUD_application;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService{

 @Autowired
        private StudentRepository studentRepository;
    
        //save employee in database
        @Override
        public Student saveStudent (Student student){
            return studentRepository.save (student);
    
        }
        //get all employee form database
        @Override
        public List<Student> getAllStudent() {
            return studentRepository.findAll();
            }
            //get employee using id
            @Override
            public Student getStudentById(long id) {
           Optional<Student> student = studentRepository.findById(id);
           if(student.isPresent()){
           return student.get();
           }else {
           throw new RuntimeException();
           }
           }
           //update employee
           @Override
           public Student updateStudent(Student student, long id) {
           Student existingStudent = studentRepository.findById(id).orElseThrow(
           ()-> new RuntimeException());
           existingStudent.setFirstName(student.getFirstName());
           existingStudent.setLastName(student.getLastName());
           existingStudent.setEmail(student.getEmail());
           // save
           studentRepository.save(existingStudent);
           return existingStudent;
           }
           //delete student
           @Override
           public void deleteStudent(long id) {
           //check
           studentRepository.findById(id).orElseThrow(()-> new
          RuntimeException());
           //delete
           studentRepository.deleteById(id);
           }
          }
          
          
          
          
    
    
    
    
    






