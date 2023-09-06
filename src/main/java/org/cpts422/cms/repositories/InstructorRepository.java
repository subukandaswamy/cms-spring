package org.cpts422.cms.repositories;

import org.cpts422.cms.entities.Instructor;
import org.springframework.data.repository.CrudRepository;

public interface InstructorRepository extends CrudRepository<Instructor, Long> {
}
