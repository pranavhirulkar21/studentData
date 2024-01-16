package com.pranav.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pranav.pojo.Student;

@Repository
public interface StudentDao extends JpaRepository<Student, Long>{

}


