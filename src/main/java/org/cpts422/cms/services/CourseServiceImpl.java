package org.cpts422.cms.services;

import org.cpts422.cms.entities.Course;
import org.cpts422.cms.entities.Instructor;
import org.cpts422.cms.repositories.CourseRepository;
import org.cpts422.cms.repositories.InstructorRepository;
import org.springframework.stereotype.Service;

@Service
public class CourseServiceImpl implements CourseService {

    private CourseRepository courseRepository;
    

    public CourseServiceImpl(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    @Override
    public Iterable<Course> findAll() {
        return courseRepository.findAll();
    }

    @Override
    public Course save(Course course) {
        return courseRepository.save(course);
    }
}
