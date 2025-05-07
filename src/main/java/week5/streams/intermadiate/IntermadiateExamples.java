package week5.streams.intermadiate;

import week2.technicalContent4.student_information_system.Course;

import java.util.List;
import java.util.Optional;

public class IntermadiateExamples {

    public static void main(String[] args) {

        List<String> names = List.of("Ali", "Ayşe", "Veli");

        names.stream().forEach(System.out::println);

        names.forEach(System.out::println);

        names.forEach(name -> {

            if (name.startsWith("A")) {

            }
            name.toUpperCase();

        });

        List<Student> students = List.of(
                new Student("Ali", List.of(new Course("Matematik"), new Course("Fizik"))),
        new Student("Zeynep", List.of(new Course("Kimya"), new Course("Biyoloji"))),
        new Student("Mehmet", List.of(new Course("Tarih"), new Course("Coğrafya"), new Course("Fizik")))
        );

        Optional<Course> optionalMatematik = students.stream()
                .flatMap(student -> student.getCourse().stream())
                .filter(course -> course.getName().equals("Matematik"))
                .findFirst();

        System.out.println(optionalMatematik.get());

        Optional<String> optionalString = students.stream()
                .flatMap(student -> student.getCourse().stream())
                .filter(course -> course.getName().equals("Matematik"))
                .map(course -> course.getName().toUpperCase())
                .findFirst();

        System.out.println(optionalMatematik.get());

        students.stream()
                .filter(student -> student.getName().equals("Ali"))
                .map(student -> student.getName())
                .peek(name -> name.trim())
                .filter(string -> string.endsWith("i"))
                .toList();


    }
}
