package com.mydata.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mydata.model.Teacher;

public interface TeacherRepository extends JpaRepository<Teacher, Integer>{

}
