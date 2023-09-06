package org.cpts422.cms.controllers;

import org.cpts422.cms.entities.Course;
import org.cpts422.cms.services.CourseService;
import org.cpts422.cms.services.InstructorService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CourseController {

    private CourseService courseService;

    private InstructorService instructorService;

    public CourseController(CourseService courseService, InstructorService instructorService) {
        this.courseService = courseService;
        this.instructorService = instructorService;
    }

    @RequestMapping("/")
    public String getCourses(Model model){
        model.addAttribute("courses", courseService.findAll());
        model.addAttribute("course", new Course());
        model.addAttribute("instructors", instructorService.findAll());
        return "index";
    }

    @PostMapping("/createCourse")
    public String createCourse(@ModelAttribute Course course, Model model){
        courseService.save(course);
        return "redirect:/";
    }

}
