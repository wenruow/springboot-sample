package com.wenruo.springbootstarter.course;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wenruo.springbootstarter.topic.Topic;

@Service
public class CourseService {
	
	@Autowired
	CourseRepository courseRepository;
	
	public List<Course> getCourses(String topicId) {
		List<Course> courses = new ArrayList<>();
		courseRepository.findByTopicId(topicId).
		forEach(courses::add);
		return courses;
	}
	
	public Course getCourse(String id) {
		return courseRepository.findById(id).get();
	}
	
	public void addCourse(Course course,String topicId) {
		course.setTopic(new Topic(topicId,"",""));
		courseRepository.save(course);
	}
	
	public void updateCourse (Course course,String topicId) {
		course.setTopic(new Topic(topicId,"",""));
		courseRepository.save(course);
	}

	public void deleteCourse(String id) {
		courseRepository.deleteById(id);
	}
	
	public List<Course> getCourseByName(String name) {
		return courseRepository.findByName(name);
	}
	
	
}
