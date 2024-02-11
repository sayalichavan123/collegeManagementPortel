package com.mydata.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.mydata.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {



}
