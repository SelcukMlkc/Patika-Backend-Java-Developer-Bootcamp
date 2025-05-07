package week5.streams.intermadiate;

import week2.technicalContent4.student_information_system.Course;

import java.util.List;

public class Student {

    private String name;
    private List<Course> course;

    public Student(String name, List<Course> course) {
        this.name = name;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public List<Course> getCourse() {
        return course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }
}
