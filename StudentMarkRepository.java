package com.mydata.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mydata.model.StudentMark;

public interface StudentMarkRepository extends JpaRepository<StudentMark, Integer>{

}
