package com.maschindra.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.maschindra.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
