package com.example.courses.services;

import com.example.courses.dao.CourseDao;
import com.example.courses.entity.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService{

//    List<Courses> list;

    @Autowired
    private CourseDao courseDao;

    public CourseServiceImpl(){
//        list = new ArrayList<>();
//        list.add(new Courses(145, "Java Core Course", "This course conatins basic of Java"));
//        list.add(new Courses(4343, "Spring Boot COurse", "Creating REST apis"));
    }

    @Override
    public List<Course> getCourses() {
        return courseDao.findAll();
//        return list;
    }

    @Override
    public Course getCourse(long courseId) {
//        Courses c = null;
//        for(Courses it:list){
//            if(it.id == courseId){
//                c = it;
//                break;
//            }
//        }
//        return c;

        return courseDao.getOne(courseId);
    }

    @Override
    public Course addCourse(Course course) {
//        list.add(course);
//        return course;
        courseDao.save(course);
        return course;
    }

    @Override
    public void deleteCourse(long courseId) {
        courseDao.delete(courseDao.getById(courseId));
    }
}
