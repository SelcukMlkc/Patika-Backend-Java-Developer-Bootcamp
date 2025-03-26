package week2.technicalContent4.student_information_system;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Teacher[] teachers = new Teacher[5];

        Teacher mathTeacher = new Teacher("Ali", "Ak", "5437658967");
        Teacher pysicsTeacher = new Teacher("Ayşe", "Sarı", "5437658961");
        Teacher chemistryTeacher = new Teacher("Fatma", "Beyaz", "5437658962");
        Teacher biologyTeacher = new Teacher("Leyla", "Demir", "5437658963");
        Teacher physicalEducationTeacher = new Teacher("Arda", "Sarı", "5437658964");

        teachers[0] = mathTeacher;
        teachers[1] = pysicsTeacher;
        teachers[2] = chemistryTeacher;
        teachers[3] = biologyTeacher;
        teachers[4] = physicalEducationTeacher;

        Course mathCourse = new Course("Matematik", "Math101", 8 );
        Course pysicsCourse = new Course("Fizik", "FZK101", 6 );
        Course chemistryCourse = new Course("Kimya", "KMY101", 6 );
        Course biologyCourse = new Course("Biyoloji", "BIO101", 4 );
        Course physicalEducationCourse = new Course("Beden Eğitimi", "BDN101", 2 );

        //Öğretmen ve dersler tanımlandı. Şimdi sırada dersleri öğretmenlere ve de öğretmenleri derslere atamada:

        mathCourse.setTeacher(mathTeacher);
        pysicsCourse.setTeacher(pysicsTeacher);
        chemistryCourse.setTeacher(chemistryTeacher);
        biologyCourse.setTeacher(biologyTeacher);
        physicalEducationCourse.setTeacher(physicalEducationTeacher);

        mathTeacher.setCourse(mathCourse);
        pysicsTeacher.setCourse(pysicsCourse);
        chemistryTeacher.setCourse(chemistryCourse);
        biologyTeacher.setCourse(biologyCourse);
        physicalEducationTeacher.setCourse(physicalEducationCourse);

        //bu şekilde hem ders üzerinden hem de öğretmen üzerinden işlem yapabileceğiz

        Student[] students = new Student[4];

        Student student1 = new Student("Selçuk", "Malakcı", LocalDate.of(1994, 9, 26), 120);
        Student student2 = new Student("Emir", "Al", LocalDate.of(1997, 2, 23), 130);
        Student student3 = new Student("Nehir", "Al", LocalDate.of(2015, 1, 5), 128);
        Student student4 = new Student("Zeynep", "Kırmızı", LocalDate.of(2011, 12, 16), 100);
        students[0] = student1;
        students[1] = student2;
        students[2] = student3;
        students[3] = student4;


        //öğrenciler tanımladık. Yani öğrenciler okula kayıt oldu artık.
        //Öncesinde oluşturmuş olduğum array listesine atama yapmalıyım

        Course[] courses = new Course[5];
        courses[0] = mathCourse;
        courses[1] = pysicsCourse;
        courses[2] = chemistryCourse;
        courses[3] = biologyCourse;
        courses[4] = physicalEducationCourse;






        for (Teacher teacher : teachers){

            System.out.println(teacher);
        }


        for (Course course : courses){

            System.out.println(course);
        }

        for (Student student : students){

            System.out.println(student);
        }

        // Şimdi bu öğrencilere ders atıyacaz. Derse kayıt oluyorlar bir bakıma:


        student1.addCourse(mathCourse, 0);
        student1.addCourse(pysicsCourse, 1);
        student1.addCourse(chemistryCourse, 2);
        student1.addCourse(biologyCourse, 3);
        student1.addCourse(physicalEducationCourse, 4);
        // student1.addCourse(mathCourse, 5);  // en fazla 5 ders eklencek şekilde ayarladık

        student2.addCourse(mathCourse, 0);
        student2.addCourse(pysicsCourse, 1);
        student2.addCourse(chemistryCourse, 2);
        student2.addCourse(biologyCourse, 3);
        student2.addCourse(physicalEducationCourse, 4);

        student3.addCourse(mathCourse, 0);
        student3.addCourse(pysicsCourse, 1);
        student3.addCourse(chemistryCourse, 2);
        student3.addCourse(biologyCourse, 3);
        student3.addCourse(physicalEducationCourse, 4);

        student4.addCourse(mathCourse, 0);
        student4.addCourse(pysicsCourse, 1);
        student4.addCourse(chemistryCourse, 2);
        student4.addCourse(biologyCourse, 3);
        student4.addCourse(physicalEducationCourse, 4);



        student1.addNotes(mathCourse, 85);
        student1.addNotes(pysicsCourse, 55);
        student1.addNotes(chemistryCourse, 75);
        student1.addNotes(biologyCourse, 60);
        student1.addNotes(physicalEducationCourse, 100);

        student2.addNotes(mathCourse, 85);
        student2.addNotes(pysicsCourse, 55);
        student2.addNotes(chemistryCourse, 75);
        student2.addNotes(biologyCourse, 60);
        student2.addNotes(physicalEducationCourse, 100);

        student3.addNotes(mathCourse, 85);
        student3.addNotes(pysicsCourse, 55);
        student3.addNotes(chemistryCourse, 75);
        student3.addNotes(biologyCourse, 60);
        student3.addNotes(physicalEducationCourse, 100);

        student4.addNotes(mathCourse, 85);
        student4.addNotes(pysicsCourse, 55);
        student4.addNotes(chemistryCourse, 75);
        student4.addNotes(biologyCourse, 60);
        student4.addNotes(physicalEducationCourse, 100);



        for (Student student : students) {

            for (Course c1 : student.getCourses()) {

                System.out.println(student.getName() + " öğrencisi " + c1.getName().toUpperCase() + " dersi için " + c1.getNote() + " notunu aldı.");
            }

        }

    }
}
