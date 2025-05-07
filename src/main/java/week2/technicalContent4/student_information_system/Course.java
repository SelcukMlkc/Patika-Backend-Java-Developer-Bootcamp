package week2.technicalContent4.student_information_system;

public class Course {

    private String name;

    private String code;

    private Integer hourseOfWeek;

    private Teacher teacher;

    private Integer note;


    public Course(String name) {
        this.name = name;
    }

    public Course(String name, String code, Integer hourseOfWeek) {
        this.name = name;
        this.code = code;
        this.hourseOfWeek = hourseOfWeek;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Integer getHourseOfWeek() {
        return hourseOfWeek;
    }

    public void setHourseOfWeek(Integer hourseOfWeek) {
        this.hourseOfWeek = hourseOfWeek;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Integer getNote() {
        return note;
    }

    public void setNote(Integer note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "Course{" +
                "hourseOfWeek=" + hourseOfWeek +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    //toString() Java’daki tüm sınıflarda bulunan (çünkü Object sınıfından miras gelir) bir metottur.
    //Bir nesneyi System.out.println(obj); gibi yazdırmak istediğinde otomatik olarak çalışır.
    //toString() → Nesnenin içeriğini daha okunur şekilde yazdırmamızı sağlar.
    //toString() ne işe yarar?	Nesneyi ekrana güzelce yazdırmak
    //Ne zaman çalışır?	Nesne System.out.println() ile yazdırılınca
    //Nerede override ederim?	Sınıf içinde, genellikle en altta
}
