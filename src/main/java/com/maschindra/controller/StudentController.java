package com.maschindra.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.maschindra.entity.Student;
import com.maschindra.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService service;
		
	@PostMapping(value = "/student")
	public @ResponseBody Student saveStudentEntity(@RequestBody Student entity)
	{
		return service.saveStudent(entity);
		
	}
	
	@PutMapping("/student")
	public @ResponseBody Student updateStudentEntity(@RequestBody Student entity)
	{
		return service.updateStudentEntity(entity);
		
	}
	
	@GetMapping("/student")
	public @ResponseBody List<Student> getAllStudentEntities()
	{
		return service.getAllStudentEntities();
	}
	
	@GetMapping("/getStudentID/{id}")
	public @ResponseBody Student getStudentEntity(@PathVariable("id") int id)
	{
		return service.getStudentEntity(id);
	}
	
	@DeleteMapping("/delStudentID")
	public @ResponseBody Student delStudentEntity(@RequestParam("id") int id)
	{
		return service.delStudentEntity(id);
	}
	
}
