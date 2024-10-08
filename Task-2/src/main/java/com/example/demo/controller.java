package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class controller {
	
	@Autowired
	private service service;
	
	@GetMapping
	public List<Course> getAllCourse() {
		
		return service.getData();
	}

	@PostMapping
	public Course addCourse(@RequestBody Course cr) {
		return service.addCourse(cr);
	}
	
	@PutMapping("{id}")
	public Course updateData(@PathVariable int id ,@RequestBody Course cr) {
		
		return service.updateData(id,cr);
	}
	
	@DeleteMapping("{id}")
	public String delete(@PathVariable int id) {
		
		service.delete(id);
		
		return "Course Deleted Successfully";
	}
}
