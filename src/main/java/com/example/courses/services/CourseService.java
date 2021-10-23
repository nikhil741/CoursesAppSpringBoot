package com.example.courses.services;

import com.example.courses.entity.Course;

import java.util.List;

public interface CourseService {
    public List<Course> getCourses();
    public Course getCourse(long courseId);
    public Course addCourse(Course course);
    public void deleteCourse(long parseLong);
}
