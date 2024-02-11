package com.mydata.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mydata.model.StudentLeave;

public interface StudentLeaveRepository extends JpaRepository<StudentLeave, Integer>{


}
