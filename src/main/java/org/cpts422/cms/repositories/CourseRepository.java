package org.cpts422.cms.repositories;

import org.cpts422.cms.entities.Course;
import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, Long> {
}
