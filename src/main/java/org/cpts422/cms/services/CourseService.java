package org.cpts422.cms.services;

import org.cpts422.cms.entities.Course;

public interface CourseService {

    public Iterable<Course> findAll();

    public Course save(Course course);
}
