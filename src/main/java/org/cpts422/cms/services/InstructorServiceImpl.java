package org.cpts422.cms.services;

import org.cpts422.cms.entities.Instructor;
import org.cpts422.cms.repositories.InstructorRepository;
import org.springframework.stereotype.Service;

@Service
public class InstructorServiceImpl implements InstructorService {

    private InstructorRepository instructorRepository;

    public InstructorServiceImpl(InstructorRepository instructorRepository) {
        this.instructorRepository = instructorRepository;
    }

    @Override
    public Iterable<Instructor> findAll() {
        return instructorRepository.findAll();
    }

    @Override
    public Instructor save(Instructor instructor) {

        return instructorRepository.save(instructor);
    }
}
