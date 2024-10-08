package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class service {
	
	@Autowired
	private CourseRepository cr;

	
	public List<Course> getData() {
		
		return cr.findAll();
	}
	

	public Course addCourse(Course course) {
		
		return cr.save(course);
	}
	

	public Course updateData(int id,Course course) {
		
		Optional<Course> data=cr.findById(id);
		
		Course crr=data.get();
		crr.setTitle(course.getTitle());
		crr.setDescription(course.getDescription());
		crr.setDuration(course.getDuration());
		
		return cr.save(crr);
	}
	
	
	public void  delete(int id) {
		
		 cr.deleteById(id);
	}

}
