package com.maschindra.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import com.maschindra.entity.Student;

@Repository
public class StudentDAO {
	
	
		
	@Autowired
	private StudentRepository repository;
	
	public Student saveStudent(Student entity)
	{
		 return repository.save(entity);
	}
	
	public List<Student> getAllStudentEntities()
	{
		return repository.findAll();
	}
	public Page<Student> structureFindAll()
	{
		PageRequest request=PageRequest.of(10, 50, Sort.by("name").ascending());
			return	repository.findAll(request);
	}
	
	public Student getStudentEntityById(int id)
	{
		return repository.findById(id).orElse(new Student(HttpStatus.NOT_FOUND.value(),HttpStatus.NOT_FOUND.name(),HttpStatus.NOT_FOUND.value()));
	}
	public Student delStudentEntity(int id)
	{
		Student entity=getStudentEntityById(id);
		if(entity.getId()!=404)
		{
		 repository.deleteById(id);
		}
		 return entity;
	}
}
