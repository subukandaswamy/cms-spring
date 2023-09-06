package org.cpts422.cms.setup;

import jakarta.persistence.criteria.CriteriaBuilder;
import org.cpts422.cms.entities.Course;
import org.cpts422.cms.entities.Instructor;
import org.cpts422.cms.repositories.CourseRepository;
import org.cpts422.cms.repositories.InstructorRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class InitialSetup implements CommandLineRunner {

    private CourseRepository courseRepository;

    private InstructorRepository instructorRepository;

    public InitialSetup(CourseRepository courseRepository, InstructorRepository instructorRepository) {
        this.courseRepository = courseRepository;
        this.instructorRepository = instructorRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Instructor subu = new Instructor("subu","kandadswamy","scholarly associate professor");
        Instructor venera = new Instructor("venera","arnadouva","associate professor");
        subu = instructorRepository.save(subu);
        venera = instructorRepository.save(venera);
        Course cpts422 = new Course("cpts422","Software Testing", subu);
        Course cpts321 = new Course("cpts321", "OOP", venera);
        cpts422 = courseRepository.save(cpts422);
        cpts321 = courseRepository.save(cpts321);
        System.out.println("Initializing Database...");
        System.out.println(cpts422);
        System.out.println(cpts321);
    }
}
