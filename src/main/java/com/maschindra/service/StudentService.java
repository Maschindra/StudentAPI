package com.maschindra.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maschindra.entity.Student;
import com.maschindra.repository.StudentDAO;
import com.maschindra.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository repository;
	
	public Student saveStudent(Student entity)
	{
		return repository.save(entity);
	}
	@Autowired
	private StudentDAO dao;
	
	public Student updateStudentEntity(Student entity)
	{
		return dao.saveStudent(entity);
	}
	
	public List<Student> getAllStudentEntities()
	{
		return dao.getAllStudentEntities();
	}
	
	public Student getStudentEntity(int id)
	{
		return dao.getStudentEntityById(id);
	}
	public Student delStudentEntity(int id)
	{
		return dao.delStudentEntity(id);
	}
}
