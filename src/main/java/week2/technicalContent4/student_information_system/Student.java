package week2.technicalContent4.student_information_system;

import java.time.LocalDate;
import java.util.Arrays;

public class Student {

    private String name;

    private String surname;

    private LocalDate birthday;

    private Integer studentNo;

    private Course[] courses = new Course[5];      // // 5 elemanlık boş bir kutu dizi nesnesi oluşturuldu. Yani en fazla 5 ders alabilir.

    //courses adında Course türünden bir dizi (array) oluşturduk.
    //Dizinin uzunluğu: 5
    //Ancak!!! Dikkat:
    //Dizi oluşturuldu, ama içindeki 5 eleman henüz oluşturulmadı.


    public Student(String name, String surname, LocalDate birthday, Integer studentNo) {
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
        this.studentNo = studentNo;
    }

    //şimdi öğrenciye ders ekleme metodu yapıcaz:

    public void addCourse(Course course, int index) {

        if (index >= 0 && index < courses.length) {
            courses[index] = course;
            System.out.println(course.getName() + " dersi eklendi.");
        } else {
            System.out.println("Maksimum ders sayısını aştınız!");
        }
    }



    public void addNotes(Course course, int note) {  //Bu bir instance metottur

        for (Course c1 : getCourses()) {

            //Döngü ile öğrencinin derslerini dolaş:
            //getCourses() → öğrencinin kayıtlı olduğu dersleri döndürüyor.
            //
            //Course c1 → her derse tek tek bakmak için döngüde tanımlanmış bir geçici değişken.

            if (c1.getName().equals(course.getName())) {
                c1.setNote(note);
                System.out.println(c1.getName() + " dersi için " + note + " notunu girdiniz." );
                break;
            } else {
                System.out.println("Bu öğrenci bu dersi almadığı için not giremezsiniz!");
            }
        }

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public Integer getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(Integer studentNo) {
        this.studentNo = studentNo;
    }

    public Course[] getCourses() {
        return courses;
    }

    private void setCourses(Course[] courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthday=" + birthday +
                ", studentNo=" + studentNo +
                '}';
    }
}
