package com.cpn.spring.soap.webservices.basicSpringBootSOAPWebservice.Service;

import com.cpn.spring.soap.webservices.basicSpringBootSOAPWebservice.Bean.Course;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Component
public class CourseDetailsService {

    public enum Status {
        SUCCESS, FAILURE;
    }

    private static List<Course> courses = new ArrayList<>();

    static {
        Course course1 = new Course(1, "Spring", "Spring desc");
        courses.add(course1);

        Course course2 = new Course(2, "Spring MVC", "Spring MVC desc");
        courses.add(course2);

        Course course3 = new Course(3, "Spring Boot", "Spring Boot desc");
        courses.add(course3);

        Course course4 = new Course(4, "Maven", "Most popular maven on internet!");
        courses.add(course4);
    }

    // course - 1
    public Course findById(int id) {
        for (Course course : courses) {
            if (course.getId() == id)
                return course;
        }
        return null;
    }

    // courses
    public List<Course> findAll() {
        return courses;
    }

    public Status deleteById(int id) {
        Iterator<Course> iterator = courses.iterator();
        while (iterator.hasNext()) {
            Course course = iterator.next();
            if (course.getId() == id) {
                iterator.remove();
                return Status.SUCCESS;
            }
        }
        return Status.FAILURE;
    }

    // updating course & new course
}