package org.cpts422.cms.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Course {

    private String courseID;

    private String courseName;

    @ManyToOne
    private Instructor instructor;

    @Id
    @GeneratedValue
    private Long id;

    public Course() {

    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public Course(String courseID, String courseName, Instructor instructor) {
        this.courseID = courseID;
        this.courseName = courseName;
        this.instructor = instructor;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    public String getCourseID() {
        return courseID;
    }

    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Course course)) return false;

        if (getCourseID() != null ? !getCourseID().equals(course.getCourseID()) : course.getCourseID() != null)
            return false;
        if (getCourseName() != null ? !getCourseName().equals(course.getCourseName()) : course.getCourseName() != null)
            return false;
        return getId() != null ? getId().equals(course.getId()) : course.getId() == null;
    }

    @Override
    public int hashCode() {
        int result = getCourseID() != null ? getCourseID().hashCode() : 0;
        result = 31 * result + (getCourseName() != null ? getCourseName().hashCode() : 0);
        result = 31 * result + (getId() != null ? getId().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseID='" + courseID + '\'' +
                ", courseName='" + courseName + '\'' +
                ", instructor=" + instructor +
                '}';
    }
}
