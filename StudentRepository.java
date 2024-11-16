package com.example.CRUD_application;



    import org.springframework.data.jpa.repository.JpaRepository;


public interface StudentRepository extends JpaRepository<Student,Long> {
    //Crud

}


