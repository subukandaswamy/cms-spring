package org.cpts422.cms.services;

import org.cpts422.cms.entities.Instructor;

public interface InstructorService {

    public Iterable<Instructor> findAll();

    public Instructor save(Instructor instructor);
}
